<%--
  Created by IntelliJ IDEA.
  User: 17339
  Date: 05/11/2019
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>

<html lang="fr">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="robots" content="all|(no)follow|(no)index|none">
    <meta name="title" content="BankeSchön"/>
    <meta name="author" content="BankeSchön"/>
    <meta name="owner" content="BankeSchön@banque.fr"/>
    <meta name="description" content="BankeSchön, gestion de banque."/>
    <link rel="stylesheet" type="text/css" href="partials/style.css"/>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="node_modules/bootstrap/dist/js/bootstrap.js"></script>
    <link rel="icon" href="img/bankeschon_logo.svg" />
    <title>BankeSchön</title>
</head>

<body>

<header>
    <!---------------------------------------------------- Navbar ----------------------------------------------------->
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="interface.jsp">
            <img src="img/bankeschon_logo.svg" width="60" height="60"
                 class="d-inline-block align-top" alt="">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <!---------------------------------------- Form contact admin ------------------------------------------------->
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="search.jsp">Rechercher un client</a>
                </li>
                <!----------------------------------------- Deconnexion ----------------------------------------------->
                <li class="nav-item">
                    <a class="nav-link" href="deconnexion">Déconnexion</a>
                </li>
            </ul>

            <!----------------------------------------- Paramètres -------------------------------------------->
            <div class="dropdown show">
                <a class="btn btn-secondary dropdown-toggle btn-help" href="#" role="button" id="dropdownMenuLink"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <img src="img/18380626211553771446.svg" width="30" height="30"
                         class="d-inline-block align-top" alt="">
                </a>
                <div class="dropdown-menu" aria-labelledby="dropleftMenuLink">
                    <!-------------------------------------- Button trigger modal ------------------------------------->
                    <button type="button" class="btn btn-link btn-support" data-toggle="modal"
                            data-target="#exampleModal">
                        Support
                    </button>
                    <!-------------------------------------------- Light & Night mode ------------------------->
                    <div class="theme-switch-wrapper">
                        <label class="theme-switch" for="checkbox">
                            <input type="checkbox" id="checkbox"/>
                            <div class="slider round"></div>
                        </label>
                        <br/> <em>Activer le mode nuit</em>
                    </div>
                </div>
            </div>
        </div>
    </nav>
</header>