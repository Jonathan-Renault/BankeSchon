<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<%@include file="partials/restriction_admin.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>

<a href="admin.jsp">
    <button type="button" class="btn btn-link"><span class="retour">Retour</span></button>
</a>
<!--------------------------------------------------- Page stat ------------------------------------------------------>
<div class="card-position">
    <h1 class="h1-prospect">Statistiques</h1>

    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="">
            <div class="card mb-3 card-margin">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/11817794381548234967.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Nombre de prospect dans la Base de données</h5>
                            <p class="card-text">
                            <%
                                String h = (String) request.getAttribute("howmanyprospect");
                                out.println( h );
                            %>
                                prospects
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>

    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="">
            <div class="card mb-3 card-margin">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/19518306061558095982.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Produit le plus vendu</h5>
                            <p class="card-text">
                                <%
                                    String user_mostsell_1 = (String) request.getAttribute("user_mostsell_1");
                                    String mostsell_1c = (String) request.getAttribute("mostsell_1c");
                                    out.println( user_mostsell_1 );
                                %>
                                avec
                                <%
                                    out.println( mostsell_1c );
                                %>
                                ventes hier et
                                <br>
                                <%
                                    String user_mostsell_30 = (String) request.getAttribute("user_mostsell_30");
                                    String mostsell_30c = (String) request.getAttribute("mostsell_30c");
                                    out.println( user_mostsell_30 );
                                %>
                                avec
                                <%
                                    out.println( mostsell_30c );
                                %>
                                ventes sur les 30 dernier jours
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>

    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="">
            <div class="card mb-3 card-margin">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/6419957441558095983.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Meilleur vendeur</h5>
                            <p class="card-text">
                                <%
                                    String user_bsell_1 = (String) request.getAttribute("user_bsell_1");
                                    String bsell_1c = (String) request.getAttribute("bsell_1c");
                                    out.println( user_bsell_1 );
                                %>
                                avec
                                <%
                                    out.println( bsell_1c );
                                %>
                                ventes hier et
                                <br>
                                <%
                                    String user_bsell_30 = (String) request.getAttribute("user_bsell_30");
                                    String bsell_30c = (String) request.getAttribute("bsell_30c");
                                    out.println( user_bsell_30 );
                                %>
                                avec
                                <%
                                    out.println( bsell_30c );
                                %>
                                ventes sur les 30 dernier jours
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>

    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="">
            <div class="card mb-3 card-margin">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/14035619871558095993.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Nombre de vente </h5>
                            <p class="card-text">
                                Hier :
                                <%
                                    String sellsuccess_1 = (String) request.getAttribute("sellsuccess_1");
                                    out.println( sellsuccess_1 );
                                %>
                                <br>
                                Sous 30 jours :
                                <%
                                    String sellsuccess_30 = (String) request.getAttribute("sellsuccess_30");
                                    out.println( sellsuccess_30 );
                                %>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>

    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="">
            <div class="card mb-3 card-margin">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/9082585501558095995.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Taux de conversion</h5>
                            <p class="card-text">
                                <%
                                    Float conversion_rate = (Float) request.getAttribute("conversion_rate");
                                    out.println( conversion_rate );
                                %>
                                %
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>

    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="">
            <div class="card mb-3 card-margin">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/7526207021558096343.svg
" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Ratio de souscription</h5>
                            <p class="card-text">
                                Hier :
                                <%
                                    Float suscription_rate_1 = (Float) request.getAttribute("suscription_rate_1");
                                    out.println( suscription_rate_1 );
                                %>
                                %
                                <br>
                                Sous 30 jours :
                                <%
                                    Float suscription_rate_30 = (Float) request.getAttribute("suscription_rate_30");
                                    out.println( suscription_rate_30 );
                                %>
                                %
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
</div>
<div class="clear"></div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>

</html>
