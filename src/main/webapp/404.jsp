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

<style>
    html {
        background-color: #282b24;
    }

    .denied {
        background-color: #282b24;
        text-transform: uppercase;
        text-align: center;
        color: white;
        margin-top: 10%;
    }

    .denied-403 {
        font-size: 10em;
    }

    .denied-access {
        font-size: 2em;
    }
</style>

<body>
<div class="denied">
    <p class="denied-403">404</p>
    <p class="denied-access">Not found</p>
    <a href="interface.jsp">Retourner à l'accueil</a>
</div>
</body>
</html>