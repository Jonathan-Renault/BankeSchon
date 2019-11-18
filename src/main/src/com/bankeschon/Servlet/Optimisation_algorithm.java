package com.bankeschon.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

import com.bankeschon.Models.Prospect;
import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Offer_history;

import com.bankeschon.Utils.Algorithm_utils;

@WebServlet(name = "Optimisation_algorithm")
public class Optimisation_algorithm extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Algorithm_utils algo = new Algorithm_utils();

        // définition des variables nécessaires au déroulé de l'algorithme
        Integer id_prospect = 3;        //test, à modifier pour récupérer le vrai id
        Prospect prospect;
        Integer score = 0;
        List<Offer> scores = null;

        // récupere le prospect qui vient d'être modifié
        prospect = algo.lastProspectModified(id_prospect);
        Integer prospectAge = algo.findAge(prospect.getBirthday());

        //récupère toutes les offres existantes, pour commencer la comparaison
        List offers = algo.getAllOffers();

        // pour chaque offre présente dans la bdd
        for (Object indexed_offer: offers) {
            // vérifie dans l'historique des offres proposées si l'offre n'a pas déjà été souscrite
            Offer offer = (Offer) indexed_offer;
            if (!algo.checkOffersProposed(id_prospect, offer.getId())) {
                // si oui, passage à l'offre suivant
                continue;
            }

            // vérifie si l'age du prospect est bien compris entre l'age maximum et minimum
            if (!algo.checkCorrectAge(prospectAge, offer.getId())) {
                // si oui, passage à l'offre suivant
                continue;
            }

            // vérifie les paramètres recommandés, pour incrémenter, décrementer ou laisser tel quel score
            String[] spendsRecommanded = {"rent", "insurance", "health", "car", "transport", "communication", "hobby", "food", "daily"};
            String[] informationsRecommanded = {"age", "salary", "family_situation", "pro_situation"};

            for (String s : informationsRecommanded) {
                score = algo.checkOfferInfoParameter(prospect, prospectAge, score, s, offer.getId());
            }

            if (prospect.getSpendings() != null) {
                for (String s : spendsRecommanded) {
                    score = algo.checkOfferSpendsParameter(prospect, score, s, offer.getId());
                }
            }
            // vérifie que le score de l'offre soit supérieur à 5
            if (score > 5) {
                // si oui, le score est ajouté au tableau scores, avec comme index le nom de l'offre
                scores.add(offer);
            }

        }

        // classe le tableau scores du plus haut entier au plus bas
    }
}
