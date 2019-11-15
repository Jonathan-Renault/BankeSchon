<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>

<!-------------------------------------------- Page de création d'un utilisateur -------------------------------------->
<a href="admin.jsp">
    <button type="button" class="btn btn-link"><span class="retour">Retour</span></button>
</a>

<div id="form-global-add">
    <form method="post" action="inscription">
        <img src="img/bankeschon_logo.svg" width="30" height="30"
             class="d-inline-block align-top" alt="Logo">
        <h2 class="text-center">Créer un nouvel utilisateur</h2>
        <div class="form-group">
            <label for="exampleInputEmail1">Adresse Email</label>
            <input type="email" class="form-control" name="email" id="exampleInputEmail1" aria-describedby="emailHelp"
                   placeholder="Entrer Email">
        </div>
        <div class="form-group">
            <label for="exampleInputaddrole">Rôle</label>
            <select class="form-control" name="role" id="exampleInputaddrole">
                <option value="1">Employé</option>
                <option value="2">Administrateur</option>
            </select>
        </div>
        <input type="submit" value="Inscription" class="btn btn-primary"/>
    </form>
</div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>

</html>
