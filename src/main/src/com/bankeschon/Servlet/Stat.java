package com.bankeschon.Servlet;

import com.bankeschon.Models.Howmanyprospect;
import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Prospect;
import com.bankeschon.Utils.stat_utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Stat extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        stat_utils stat = new stat_utils();

        Offer offers = stat.getAllOffers();
            System.out.println(offers);



        List<Prospect> prospects = stat.getAllProspects();
        for (Prospect prospect:prospects)
        {
            System.out.println(prospect);
            System.out.println(prospect.getMail());
        }

        Howmanyprospect howmanyprospects = stat.getHowmanyprospect();

        Float i = howmanyprospects.getCount();
            System.out.println(i);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
