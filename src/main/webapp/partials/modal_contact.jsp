<%--
  Created by IntelliJ IDEA.
  User: 17339
  Date: 05/11/2019
  Time: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!------------------------------------------------- Modal contact ------------------------------------------------->
<div class="container-fluid">
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                        height="30"
                                                                        class="d-inline-block align-top" alt="">&nbsp;
                        Contact</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <!------------------------------------ Form contact admin ------------------------------------->
                    <div id="form-contact">
                        <form>
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
</div>