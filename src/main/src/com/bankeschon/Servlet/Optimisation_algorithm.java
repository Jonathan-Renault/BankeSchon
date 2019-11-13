package com.bankeschon.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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


        // récupere le prospect qui vient d'être modifié
        prospect = algo.lastProspectModified(id_prospect);
        /*System.out.println(prospect.getMail());     //test, à supprimer*/


        // pour chaque offre présente dans la bdd


            // vérifie dans l'historique des offres proposées si l'offre n'a pas déjà été souscrite

                // si oui, le score de l'offre passe à 0, et passage à l'offre suivant


            // vérifie si l'age du prospect est bien compris entre l'age maximum et minimum

                // si oui, le score de l'offre passe à 0


            // vérifie les paramètres recommandés, pour incrémenter, décrementer ou laisser tel quel score


            // vérifie que le score de l'offre soit supérieur à 5

                // si oui, le score est ajouté au tableau scores, avec comme index le nom de l'offre


            // classe le tableau scores du plus haut entier au plus bas
    }
}
