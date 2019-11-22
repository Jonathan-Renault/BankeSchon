package com.bankeschon.Servlet;

import com.bankeschon.Utils.Database;
import com.bankeschon.Utils.Login_Register_Util;

import com.bankeschon.Models.Offer;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Produit extends HttpServlet {
    public static final String VUE = "/new_product.jsp";
    public static final String CHAMP_OFFERNAME = "offerName";
    public static final String CHAMP_OFFERPRIORITY = "offerPriority";
    public static final String CHAMP_OFFERMINIMUMAGE = "offerMinimumAge";
    public static final String CHAMP_OFFERMAXIMUMAGE = "offerMaximumAge";
    public static final String CHAMP_OFFERRECAGE1 = "offerRecAge1";
    public static final String CHAMP_OFFERRECAGE2 = "offerRecAge2";
    public static final String CHAMP_OFFERRECSALARY1 = "offerRecSalary1";
    public static final String CHAMP_OFFERRECSALARY2 = "offerRecSalary2";
    public static final String CHAMP_OFFERRECFAMILY = "offerRecFamily";
    public static final String CHAMP_OFFERRECPRO = "recProSituation";
    public static final String CHAMP_OFFERLOYER = "offerLoyer";
    public static final String CHAMP_OFFERASSURANCES = "offerAssurances";
    public static final String CHAMP_OFFERSANTE = "offerSante";
    public static final String CHAMP_OFFERVEHICULE = "offerVehicule";
    public static final String CHAMP_OFFERTRANSPORTS = "offerTransports";
    public static final String CHAMP_OFFERCOMMUNICATIONS = "offerCommunications";
    public static final String CHAMP_OFFERLOISIRS = "offerLoisirs";
    public static final String CHAMP_OFFERNOURRITURES = "offerNourritures";
    public static final String CHAMP_OFFERDEPENSES = "offerDepenses";
    public static final String ATT_ERREURS = "erreurs";
    public static final String ATT_RESULTAT = "resultat";

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Login_Register_Util call = new Login_Register_Util();
        String resultat;
        Map<String, String> erreurs = new HashMap<String, String>();

        /* Récupération des champs du formulaire. */
        String offerName = request.getParameter(CHAMP_OFFERNAME);
        Integer offerPriority = Integer.valueOf(request.getParameter(CHAMP_OFFERPRIORITY));
        Integer offerMinimumAge = Integer.valueOf(request.getParameter(CHAMP_OFFERMINIMUMAGE));
        Integer offerMaximumAge = Integer.valueOf(request.getParameter(CHAMP_OFFERMAXIMUMAGE));
        Integer offerFamily = Integer.valueOf(request.getParameter(CHAMP_OFFERRECFAMILY));
        Integer offerPro = Integer.valueOf(request.getParameter(CHAMP_OFFERRECPRO));
        Integer offerLoyer = Integer.valueOf(request.getParameter(CHAMP_OFFERLOYER));
        Integer offerAssurances = Integer.valueOf(request.getParameter(CHAMP_OFFERASSURANCES));
        Integer offerSante = Integer.valueOf(request.getParameter(CHAMP_OFFERSANTE));
        Integer offerVehicule = Integer.valueOf(request.getParameter(CHAMP_OFFERVEHICULE));
        Integer offerTransports = Integer.valueOf(request.getParameter(CHAMP_OFFERTRANSPORTS));
        Integer offerCommunications = Integer.valueOf(request.getParameter(CHAMP_OFFERCOMMUNICATIONS));
        Integer offerLoisirs = Integer.valueOf(request.getParameter(CHAMP_OFFERLOISIRS));
        Integer offerNourritures = Integer.valueOf(request.getParameter(CHAMP_OFFERNOURRITURES));
        Integer offerDepenses = Integer.valueOf(request.getParameter(CHAMP_OFFERDEPENSES));


        Offer offer = new Offer();

        String offerRecSalary = request.getParameter(CHAMP_OFFERRECSALARY1) + "-" + request.getParameter(CHAMP_OFFERRECSALARY2);
        String offerRecAge = request.getParameter(CHAMP_OFFERRECAGE1) + "-" + request.getParameter(CHAMP_OFFERRECAGE2);
        Timestamp date = new Timestamp(System.currentTimeMillis());

        /* Validation du champ email. */
        try {
            call.validationName(offerName);
        } catch (Exception e) {
            erreurs.put(CHAMP_OFFERNAME, e.getMessage());
        }

        if (erreurs.isEmpty()) {
            resultat = "Succès de l'inscription.";
            System.out.println(" Succès de l'inscription.");

            offer
                    .setRecommanded_family_situation(offerFamily)
                    .setOffer_name(offerName)
                    .setPriority(offerPriority)
                    .setMinimum_age(offerMinimumAge)
                    .setMaximum_age(offerMaximumAge)
                    .setRecommanded_age(offerRecAge)
                    .setRecommanded_salary(offerRecSalary)
                    .setRecommanded_pro_situation(offerPro)
                    .setRent_spend_recommanded(offerLoyer)
                    .setHealth_spend_recommanded(offerSante)
                    .setInsurance_spend_recommanded(offerAssurances)
                    .setCar_spend_recommanded(offerVehicule)
                    .setTransport_spend_recommanded(offerTransports)
                    .setCommunication_spend_recommanded(offerCommunications)
                    .setHobby_spend_recommanded(offerLoisirs)
                    .setFood_spend_recommanded(offerNourritures)
                    .setDaily_spend_recommanded(offerDepenses)
                    .setCreated_at(date)
                    .setUpdated_at(null);

            Database.insert(offer);
            System.out.println("Situation Familliale : " + offerFamily);
            System.out.println("Nom de l'offre : " + offerName);
            System.out.println("Priorité de l'offre : " + offerPriority);
            System.out.println("Age minimum : " + offerMinimumAge);
            System.out.println("Age maximum : " + offerMaximumAge);
            System.out.println("Plage d'age rec : " + offerRecAge);
            System.out.println("Plage d'offre rec : " + offerRecSalary);
            System.out.println("Situation pro : " + offerPro);
            System.out.println("Loyer : " + offerLoyer);
            System.out.println("Santé : " + offerSante);
            System.out.println("Assurance : " + offerAssurances);
            System.out.println("Véhicule : " + offerVehicule);
            System.out.println("Transport : " + offerTransports);
            System.out.println("Communication : " + offerCommunications);
            System.out.println("Loisirs : " + offerLoisirs);
            System.out.println("Nourritures : " + offerNourritures);
            System.out.println("Depenses : " + offerDepenses);
            System.out.println("Created At : " + date);
            System.out.println("Updated At : " + date);

        } else {
            System.out.println("Pas succès de l'inscription.");
            resultat = "Echec de l'inscription.";
        }

        /* Stockage du résultat et des messages d'erreur dans l'objet request */
        request.setAttribute(ATT_ERREURS, erreurs);
        request.setAttribute(ATT_RESULTAT, resultat);

        /* Transmission de la paire d'objets request/response à notre JSP */
        this.getServletContext().getRequestDispatcher(VUE).forward(request, response);

    }

}


