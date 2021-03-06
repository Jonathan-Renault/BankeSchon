package com.bankeschon.Utils;

import com.bankeschon.Models.BaseModelORM;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    //private static String database = System.getenv("database");
    //private static String user = System.getenv("user");
    //private static String password = System.getenv("password");
    private static Connection dbConnection = null;
    private static String database  = "bankeschon";
    private static String user      = "postgres";
    private static String password  = "postgres";

    public static void connect()
    {
        if( dbConnection == null )
        {
            System.out.println("[DB] Entering Database Connect.");
            try
            {
                Class.forName("org.postgresql.Driver");
                dbConnection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database , user, password);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }

    public static void close()
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

                /*_object.setId(_newId);*/
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

    public static List select(BaseModelORM _object, ArrayList<String> fields, ArrayList<String> filter){

        System.out.println("[DB] Entering SELECT");

        connect();

        List resultat = new ArrayList<>();

        if (dbConnection != null) {
            System.out.println("[DB] Got connection , Preparing statement");

            PreparedStatement _selectQuery = _object.getSelectQuery(dbConnection, fields, filter);

            try {

                ResultSet rs = _selectQuery.executeQuery();

                while (rs.next())
                {
                    BaseModelORM _newObject = (BaseModelORM) Class.forName(_object.getClass().getName()).newInstance();
                    resultat.add(_newObject.populate(rs, fields));
                }

                System.out.println("[DB] Statement ran.");

            } catch (Exception e) {

                e.printStackTrace();
            }

            close();

            System.out.println("[DB] Existing Select");
        }
        return resultat;
    }

    public static void remove(BaseModelORM _object, Integer id){

        System.out.println("Entering DELETE");

        connect();

        if (dbConnection != null){
            System.out.println("Got to connection");

            PreparedStatement _removeQuery = _object.getRemoveQuery(dbConnection, id);

            try
            {
                _removeQuery.execute();

                System.out.println("Remove effectué");
            }
            catch (SQLException e)
            {
                System.out.println(e);
            }
        }
        close();

        System.out.println("Databse closing");
    }

    public static void updateId(BaseModelORM _object, Integer id){

        System.out.println("Entering UpdateId");

        connect();

        if (dbConnection != null){

            System.out.println("Go the connection");

            PreparedStatement _updateIdQuery = _object.getUpdateIdQuery(dbConnection, id);

            try
            {
                _updateIdQuery.execute();

                System.out.println("Update Effectué");
            }
            catch (SQLException e)
            {
                System.out.println(e);
            }
        }
        close();
    }

}
