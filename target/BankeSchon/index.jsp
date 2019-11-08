<%--
  Created by IntelliJ IDEA.
  User: 17339
  Date: 11/10/2019
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<html lang="fr">

<head>

    <%@include file="partials/head.jsp" %>
    <title>BankeSchön</title>

</head>

<body>

<div id="form-global">
    <form>
        <img src="img/bankeschon_logo.svg" width="80" height="80"
             class="d-inline-block align-top" alt="Logo">
        <h2 class="text-center">Connexion</h2>
        <div class="form-group">
            <label for="exampleInputEmail1">Adresse Email</label>
            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Entrer une adresse Email">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Mot de passe</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Mot de passe">
        </div>
        <button type="submit" class="btn btn-primary">Se connecter</button>
    </form>
</div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>
</html>