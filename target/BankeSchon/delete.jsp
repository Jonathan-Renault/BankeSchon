<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>

<!--------------------------------------------------- Page delete user ------------------------------------------------>
<a href="admin.jsp">
    <button type="button" class="btn btn-link"><span class="retour">Retour</span></button>
</a>

<!------------------------------------------------- Modal contact ------------------------------------------------->
<div class="container-fluid">
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <!------------------------------------ Form contact admin ------------------------------------->
                    <div id="form-contact">
                        <form>
                            <h1 class="form-contact-h1">Contact Admin/Resp</h1>
                            <div class="form-group">
                                <label for="exampleFormControlSelect1">Contacter</label>
                                <select class="form-control" id="exampleFormControlSelect1">
                                    <option>Administrateur</option>
                                    <option>Responsable</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label for="exampleFormControlTextarea1">Quel est votre problème ? </label>
                                <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary">Envoyer</button>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                </div>
            </div>
        </div>
    </div>

    <div class="container interface">
        <h1 class="h1-prospect">Suppression d'un utilisateur</h1>

        <nav class="navbar-search">
            <form class="form-navbar-search">
                <input class="input-search" type="search" placeholder="Search" aria-label="Search">
                <button class="btn-search" type="submit">Search</button>
            </form>
        </nav>
        <br/>

        <div class="table-responsive">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Email</th>
                    <th scope="col">Status</th>
                    <th scope="col"></th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>email@gmail.com</td>
                    <td>Administrateur</td>
                    <td>
                        <form class="" method="post">
                            <input name="inputHiddenValue" type="hidden" value="">
                            <input type="submit" class="btn btn-outline-danger" name="submittedDelUser"
                                   value="Supprimer cet utilisateur">
                        </form>
                    </td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>email@gmail.com</td>
                    <td>Employé</td>
                    <td>
                        <form class="" method="post">
                            <input name="inputHiddenValue" type="hidden" value="">
                            <input type="submit" class="btn btn-outline-danger" name="submittedDelUser"
                                   value="Supprimer cet utilisateur">
                        </form>
                    </td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>email@gmail.com</td>
                    <td>Employé</td>
                    <td>
                        <form class="" method="post">
                            <input name="inputHiddenValue" type="hidden" value="">
                            <input type="submit" class="btn btn-outline-danger" name="submittedDelUser"
                                   value="Supprimer cet utilisateur">
                        </form>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>

</html>
