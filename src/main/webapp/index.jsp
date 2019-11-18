<%--
  Created by IntelliJ IDEA.
  User: 17339
  Date: 11/10/2019
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="fr">

<head>

    <%@include file="partials/head.jsp" %>
    <title>BankeSchön</title>

</head>

<body>

<div id="form-global">
    <form method="post" action="connexion">
        <img src="img/bankeschon_logo.svg" width="80" height="80"
             class="d-inline-block align-top" alt="Logo">
        <h2 class="text-center">Connexion</h2>
        <div class="form-group">
            <label for="exampleInputEmail1">Adresse Email</label>
            <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Entrer une adresse Email">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Mot de passe</label>
            <input type="password" class="form-control" name="motdepasse" id="exampleInputPassword1"
                   placeholder="Mot de passe">
        </div>
        <input type="submit" value="Se connecter" class="btn btn-primary"/>
        <%-- Vérification de la présence d'un objet utilisateur en session --%>
        <c:if test="${!empty sessionScope.sessionUtilisateur}">
            <%-- Si l'utilisateur existe en session, alors on affiche son adresse email. --%>
            <p class="succes">Vous êtes connecté(e) avec l'adresse : ${sessionScope.sessionUtilisateur.email}</p>
        </c:if>
    </form>
</div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>
</html>