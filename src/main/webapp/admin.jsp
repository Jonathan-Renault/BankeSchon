<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>

<!--------------------------------------------------- Page admin ------------------------------------------------------>
<div class="card-position">
    <!---------------------------------------------- Card add user ---------------------------------------------------->
    <div class="float">
        <a href="add.jsp">
            <div class="card mb-3 card-margin" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/1873740441536922612.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Nouvel utilisateur</h5>
                            <p class="card-text">Création d'un nouvel utilisateur de BankeSchön en fonction d'un rôle
                                attribué.</p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
    <!---------------------------------------------- Card delete user ------------------------------------------------------->
    <div class="float">
        <a href="delete.jsp">
            <div class="card mb-3 card-margin" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/1590403791536922613.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Suppression utilisateur</h5>
                            <p class="card-text">Suppression d'un utilisateur. Attention, cette action est
                                irréversible.</p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
    <!---------------------------------------------- Card create ------------------------------------------------------->
    <div class="float">
        <a href="new.jsp">
            <div class="card mb-3 card-margin" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/4326693151536837258.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Nouveau produit</h5>
                            <p class="card-text">Créer un nouveau produit à présenter à vos prospect ou vos clients.</p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
    <!---------------------------------------------- Card Edit ------------------------------------------------------->
    <div class="float">
        <a href="edit_product.jsp">
            <div class="card mb-3 card-margin" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/6877832671536837259.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Modifier ou supprimer un produit</h5>
                            <p class="card-text">Modifier un produit à votre guise.</p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                </div>
            </div>
        </a>
    </div>
    <!---------------------------------------------- Card History user ------------------------------------------------------->
    <div class="float">
        <a href="historique.jsp">
            <div class="card mb-3 card-margin" style="max-width: 540px;">
                <div class="row no-gutters">
                    <div class="col-md-4">
                        <img src="img/2458058871536922617.svg" class="card-img" alt="img">
                    </div>
                    <div class="col-md-8">
                        <div class="card-body">
                            <h5 class="card-title">Historique</h5>
                            <p class="card-text">Consultez l'historique de vos derniers clients, ou vos derniers
                                prospects.</p>
                            <p class="card-text"><small class="text-muted">Last updated 3 mins ago</small></p>
                        </div>
                    </div>
                </div>
            </div>
    </div>
    </a>
</div>
<div class="clear"></div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>

</html>
