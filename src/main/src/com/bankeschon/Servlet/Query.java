package com.bankeschon.Servlet;

import com.bankeschon.Utils.Query_utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "Query")
public class Query extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Query_utils q = new Query_utils();

        //all prospects
        String qh               = "SELECT * FROM howmanyprospect";
        String h                = q.getstat(qh, "count");

        request.setAttribute( "howmanyprospect", h );

        // bestseller_1
        String bsell_1          = "SELECT * FROM bestseller_1";

        String bsell_1id        = q.getstat(bsell_1, "id_user");

        String bsell_1c         = q.getstat(bsell_1, "count");
        request.setAttribute( "bsell_1c", bsell_1c );

        String user_bsell_1         = "SELECT * FROM users where id = " + bsell_1id;
        String user_bsell_1s        = q.getstat(user_bsell_1, "login");
        request.setAttribute( "user_bsell_1", user_bsell_1s );


        // bestseller_30
        String bsell_30          = "SELECT * FROM bestseller_30";

        String bsell_30id        = q.getstat(bsell_30, "id_user");

        String bsell_30c         = q.getstat(bsell_30, "count");
        request.setAttribute( "bsell_30c", bsell_30c );

        String user_bsell_30         = "SELECT * FROM users where id = " + bsell_30id;
        String user_bsell_30s        = q.getstat(user_bsell_30, "login");
        request.setAttribute( "user_bsell_30", user_bsell_30s );


        // mostsell_1
        String mostsell_1          = "SELECT * FROM mostsell_1";

        String mostsell_1id        = q.getstat(mostsell_1, "id_offer");

        String mostsell_1c         = q.getstat(mostsell_1, "count");
        request.setAttribute( "mostsell_1c", mostsell_1c );

        String user_mostsell_1         = "SELECT * FROM offers where id = " + mostsell_1id;
        String user_mostsell_1s        = q.getstat(user_mostsell_1, "offer_name");
        request.setAttribute( "user_mostsell_1", user_mostsell_1s );


        // mostsell_30
        String mostsell_30          = "SELECT * FROM mostsell_30";

        String mostsell_30id        = q.getstat(mostsell_30, "id_offer");

        String mostsell_30c         = q.getstat(mostsell_30, "count");
        request.setAttribute( "mostsell_30c", mostsell_30c );

        String user_mostsell_30         = "SELECT * FROM offers where id = " + mostsell_30id;
        String user_mostsell_30s        = q.getstat(user_mostsell_30, "offer_name");
        request.setAttribute( "user_mostsell_30", user_mostsell_30s );


        //sellsuccess_1
        String sellsuccess_1               = "SELECT * FROM sellsuccess_1";
        String sellsuccess_1s                = q.getstat(sellsuccess_1, "count");

        request.setAttribute( "sellsuccess_1", sellsuccess_1s );


        //sellsuccess_30
        String sellsuccess_30               = "SELECT * FROM sellsuccess_30";
        String sellsuccess_30s                = q.getstat(sellsuccess_30, "count");

        request.setAttribute( "sellsuccess_30", sellsuccess_30s );


        //howmanycall_1
        String howmanycall_1               = "SELECT * FROM howmanycall_1";
        String howmanycall_1s                = q.getstat(howmanycall_1, "count");


        //howmanycall_30
        String howmanycall_30               = "SELECT * FROM howmanycall_30";
        String howmanycall_30s                = q.getstat(howmanycall_30, "count");


        //howmanyprospect_iscustomer
        String howmanyprospect_iscustomer               = "SELECT * FROM howmanyprospect_iscustomer";
        String howmanyprospect_iscustomers                = q.getstat(howmanyprospect_iscustomer, "count");


        // suscription_rate_1
        Integer howmanycall_1_int = Integer.parseInt(howmanycall_1s);
        Integer sellsuccess_1_int = Integer.parseInt(sellsuccess_1s);

        Float suscription_rate_1 = (Float.valueOf(howmanycall_1_int / sellsuccess_1_int)) * 100;
        request.setAttribute( "suscription_rate_1", suscription_rate_1 );


        // suscription_rate_30
        Integer howmanycall_30_int = Integer.parseInt(howmanycall_30s);
        Integer sellsuccess_30_int = Integer.parseInt(sellsuccess_30s);

        Float suscription_rate_30 = (Float.valueOf(howmanycall_30_int / sellsuccess_30_int)) * 100;
        request.setAttribute( "suscription_rate_30", suscription_rate_30 );

        // conversion_rate
        Integer h_int = Integer.parseInt(h);
        Integer howmanyprospect_iscustomer_int = Integer.parseInt(howmanyprospect_iscustomers);

        Float conversion_rate = ((float)howmanyprospect_iscustomer_int / h_int) * 100f;
        request.setAttribute( "conversion_rate", conversion_rate );

        System.out.println(howmanyprospect_iscustomer_int);
        System.out.println("/");
        System.out.println(h_int);
        System.out.println("=");
        System.out.println(conversion_rate);

        this.getServletContext().getRequestDispatcher( "/stat.jsp" ).forward( request, response );

    }
}
