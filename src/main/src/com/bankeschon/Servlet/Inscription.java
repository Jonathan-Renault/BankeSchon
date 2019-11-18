package com.bankeschon.Servlet;

import com.bankeschon.Models.User;
import com.bankeschon.Utils.Database;
import com.bankeschon.Utils.Login_Register_Util;
import org.mindrot.jbcrypt.BCrypt;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inscription extends HttpServlet {
    public static final String VUE = "/inscription.jsp";
    public static final String CHAMP_EMAIL = "email";
    public static final String CHAMP_ROLE = "role";
    public static final String ATT_ERREURS = "erreurs";
    public static final String ATT_RESULTAT = "resultat";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Login_Register_Util call = new Login_Register_Util();
        String resultat;
        Map<String, String> erreurs = new HashMap<String, String>();

        /* Récupération des champs du formulaire. */
        String login = request.getParameter(CHAMP_EMAIL);
        Integer role = Integer.valueOf(request.getParameter(CHAMP_ROLE));

        /* Validation du champ email. */
        try {
            call.validationEmail(login);
        } catch (Exception e) {
            erreurs.put(CHAMP_EMAIL, e.getMessage());
        }

        /* Initialisation du résultat global de la validation. */
        if (erreurs.isEmpty()) {
            resultat = "Succès de l'inscription.";
            System.out.println("Succès de l'inscription.");

            User user = new User();

            String password = call.generateRandomString();
            String pwd_test = "admin";
            String pw_hash = BCrypt.hashpw(pwd_test, BCrypt.gensalt());
            Timestamp date = new Timestamp(System.currentTimeMillis());

            user
                    .setLogin(login)
                    .setRole(role)
                    .setPassword(pw_hash)
                    .setCreated_at(date)
                    .setUpdated_at(null);

            Database.insert(user);
            System.out.println(pw_hash);
            System.out.println(date);
            System.out.println(login);
            System.out.println(role);
        } else {
            resultat = "Échec de l'inscription.";
            System.out.println("Pas succès de l'inscription.");
        }

        /* Stockage du résultat et des messages d'erreur dans l'objet request */
        request.setAttribute(ATT_ERREURS, erreurs);
        request.setAttribute(ATT_RESULTAT, resultat);

        /* Transmission de la paire d'objets request/response à notre JSP */
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }
}

