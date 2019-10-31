package com.bankeschon.servlets;

import com.bankeschon.Models.BaseModelORM;

import java.sql.*;

public class Database {
    private static Connection dbConnection = null;
    private static String database  = "java1";
    private static String user      = "root";
    private static String password  = "";

    public static void connect()
    {
        if( dbConnection == null )
        {
            System.out.println("[DB] Entering Database Connect.");
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, user, password);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    private static void close()
    {
        if( dbConnection != null )
        {
            System.out.println("[DB] Closing database connection.");
            try
            {
                dbConnection.close();

                dbConnection = null;
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static Integer insert(BaseModelORM _object)
    {
        Integer _newId = null;

        System.out.println("[DB] Entering INSERT.");

        connect();

        if( dbConnection != null )
        {
            System.out.println("[DB] Got connection. Preparing statement.");

            PreparedStatement _insertQuery = _object.getInsertQuery(dbConnection);

            try
            {
                _insertQuery.executeUpdate();

                System.out.println("[DB] Statement ran. Picking last inserted ID.");

                // ... yeah. Bit strange, but works, so ...
                ResultSet keys = _insertQuery.getGeneratedKeys();
                keys.next();

                _newId = keys.getInt(1);

                System.out.println("[DB] Got last inserted ID. Setting it in object ( maybe for future 'UPDATE' query ? )");

                _object.setId(_newId);
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }

        close();

        System.out.println("[DB] Exiting INSERT.");

        return _newId;
    }

    public static void update(BaseModelORM _object)
    {
        System.out.println("[DB] Entering UPDATE.");

        connect();

        if( dbConnection != null )
        {
            System.out.println("[DB] Got connection. Preparing statement.");

            PreparedStatement _updateQuery = _object.getUpdateQuery(dbConnection);

            try
            {
                _updateQuery.execute();

                System.out.println("[DB] Statement ran.");
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }

        close();

        System.out.println("[DB] Exiting UPDATE.");

        return;
    }

    public static void select(BaseModelORM _object)
    {
        System.out.println("[DB] Entering SELECT.");

        connect();

        if( dbConnection != null )
        {
            System.out.println("[DB] Got connection. Preparing statement.");

            PreparedStatement _updateQuery = _object.getUpdateQuery(dbConnection);

            try
            {
                _updateQuery.execute();

                System.out.println("[DB] Statement ran.");
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }

        close();

        System.out.println("[DB] Exiting SELECT.");

        return;
    }
}