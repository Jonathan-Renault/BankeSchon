package com.bankeschon.Servlet;

import com.bankeschon.Models.User;
import com.bankeschon.Utils.Database;
import com.bankeschon.Utils.Filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Test_bdd")
public class Test_bdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User myuser = new User();
        ArrayList<String> fields = new ArrayList<>();
        ArrayList<String> filters = new ArrayList<>();
        fields.add("*");
        Database.select(myuser, fields, filters);
    }
}
