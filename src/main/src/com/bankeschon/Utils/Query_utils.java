package com.bankeschon.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.lang.String;


public class Query_utils {

    private static Connection dbConnection = null;
    private static String database  = "bankeschon";
    private static String user      = "postgres";
    private static String password  = "postgres";

    public String getstat(String query, String column) {

           System.out.println("[DB] Entering Database Connect.");
           String i = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database , user, password);
            Statement stmt = dbConnection.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery(query);

            while ( rs.next() ) {
                i = rs.getString(column);
            }


            System.out.println("[DB] Closing database connection.");
            dbConnection.close();

        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }


        return i;
    }
}
