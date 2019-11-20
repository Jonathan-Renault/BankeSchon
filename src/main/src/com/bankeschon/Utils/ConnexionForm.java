package com.bankeschon.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.bankeschon.Models.User;
import org.mindrot.jbcrypt.BCrypt;

public final class ConnexionForm {

    private String resultat;
    private Map<String, String> erreurs = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public User connecterUtilisateur(HttpServletRequest request, String CHAMP_EMAIL, String CHAMP_PASS) {
        /* Récupération des champs du formulaire */

        User utilisateur = new User();

        ArrayList<String> fields = new ArrayList();
        fields.add("*");
        ArrayList filtres = new ArrayList();
        filtres.add(Filter.add("=", "login", "'" + CHAMP_EMAIL + "'"));
        List<User> i = Database.select(utilisateur, fields, filtres);
        for (User result : i) {
            if (result.getLogin() != null) {
                String mdp = result.getPassword();
                if (BCrypt.checkpw(CHAMP_PASS, mdp)) {

                    String email = result.getLogin();
                    Integer role = result.getRole();
                    HttpSession session = request.getSession();

                    //AJOUT ATTRIBUT DANS LA SESSION
                    session.setAttribute("email", email);
                    session.setAttribute("role", role);

                    System.out.println(result.getLogin());
                    System.out.println(result.getRole());
                    System.out.println(result.getPassword());

                }
            }
        }
        /* Validation du champ email. */
        try {
            validationEmail(CHAMP_EMAIL);
        } catch (Exception e) {
            setErreur(CHAMP_EMAIL, e.getMessage());
        }

        /* Validation du champ mot de passe. */
        try {
            validationMotDePasse(CHAMP_PASS);
        } catch (Exception e) {
            setErreur(CHAMP_PASS, e.getMessage());
        }

        /* Initialisation du résultat global de la validation. */
        if (erreurs.isEmpty()) {
            resultat = "Succès de la connexion.";
            System.out.println("Succès de la connexion.");
        } else {
            resultat = "Échec de la connexion.";
            System.out.println("Échec de la connexion.");
        }

        return utilisateur;
    }

    /**
     * Valide l'adresse email saisie.
     */
    private void validationEmail(String email) throws Exception {
        if (email != null && !email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
            throw new Exception("Merci de saisir une adresse mail valide.");
        }
    }

    /**
     * Valide le mot de passe saisi.
     */
    private void validationMotDePasse(String motDePasse) throws Exception {
        if (motDePasse != null) {
            if (motDePasse.length() < 3) {
                throw new Exception("Le mot de passe doit contenir au moins 3 caractères.");
            }
        } else {
            throw new Exception("Merci de saisir votre mot de passe.");
        }
    }

    /*
     * Ajoute un message correspondant au champ spécifié à la map des erreurs.
     */
    private void setErreur(String champ, String message) {
        erreurs.put(champ, message);
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
        String valeur = request.getParameter(nomChamp);
        if (valeur == null || valeur.trim().length() == 0) {
            return null;
        } else {
            return valeur;
        }
    }
}