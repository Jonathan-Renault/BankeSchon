<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>
<!--------------------------------------------------- Restriction ----------------------------------------------------->
<%@include file="partials/restriction_admin.jsp" %>
<!---------------------------------------------- Page historique des appels ------------------------------------------->
<a href="admin.jsp">
    <button type="button" class="btn btn-link"><span class="retour">Retour</span></button>
</a>

<div class="modal-dialog" role="document">
    <div class="modal-content">
        <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                height="30"
                                                                class="d-inline-block align-top" alt="">&nbsp;
                Créer un nouveau produit</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
        </div>
        <div class="modal-body">
            <!------------------------------------ Form new product ------------------------------------->
            <form method="post" action="produit">
                <div class="form-group">
                    <label for="exampleInputName">Nom de l'offre</label>
                    <input type="text" name="offerName" class="form-control" id="exampleInputName"
                           aria-describedby="emailHelp"
                           placeholder="Nom">
                </div>
                <div class="form-group">
                    <label for="exampleInputImportant">Priorité</label>
                    <select class="form-control" name="offerPriority" id="exampleInputImportant">
                        <option value="1">Faible</option>
                        <option value="2">Moyen</option>
                        <option value="3">Forte</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleInputMin">Âge minimum</label>
                    <input class="form-control" name="offerMinimumAge" type="number" value="18" id="exampleInputMin">
                </div>
                <div class="form-group">
                    <label for="exampleInputMax">Âge maximum</label>
                    <input class="form-control" name="offerMaximumAge" type="number" value="60" id="exampleInputMax">
                </div>
                <div class="form-group">
                    <label for="exampleInputRecommandedAge">Plage d'âge recommandée</label>
                    <label for="exampleInputRecommandedAge2"></label>
                    <input class="form-control" name="offerRecAge1" type="number" value="18"
                           id="exampleInputRecommandedAge"> <br/>
                    <input class="form-control" name="offerRecAge2" type="number" value="60"
                           id="exampleInputRecommandedAge2">
                </div>
                <div class="form-group">
                    <label for="exampleInputRecommandedSalary">Salaire Brut recommandé</label>
                    <label for="exampleInputRecommandedSalary2"></label>
                    <input class="form-control" name="offerRecSalary1" type="number" value="1270"
                           id="exampleInputRecommandedSalary"> <br/>
                    <input class="form-control" name="offerRecSalary2" type="number" value="2000"
                           id="exampleInputRecommandedSalary2">
                </div>
                <div class="form-group">
                    <label for="exampleInputFamilySituation">Situation familiale recommandée</label>
                    <select class="form-control" name="offerRecFamily" id="exampleInputFamilySituation">
                        <option value="1">Célibataire</option>
                        <option value="2">Marié</option>
                        <option value="3">Divorcé</option>
                        <option value="4">Veuf</option>
                        <option value="5">Pacsé</option>
                        <option value="6">Aucune</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="exampleInputProSituation">Situation professionnelle recommandée</label>
                    <select class="form-control" name="recProSituation" id="exampleInputProSituation">
                        <option value="1">Demandeur d'emploi</option>
                        <option value="2">Indépendant</option>
                        <option value="3">Employé/Ouvrier</option>
                        <option value="4">Cadre</option>
                        <option value="5">Fonctionnaire</option>
                        <option value="6">Aucune</option>
                    </select>
                </div>
                <!------------------------------------------------Les types de dépenses--------------------------------------->
                <h5>Les types de dépenses</h5>
                <!------------------------------------------------Loyer--------------------------------------->
                <fieldset class="form-group loyer">
                    <legend class="col-form-label col-sm-2 pt-0">Loyer</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerLoyer"
                               id="loyerNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="loyerNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerLoyer"
                               id="loyerNeutre"
                               value="0">
                        <label class="form-check-label" for="loyerNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerLoyer"
                               id="loyerRec"
                               value="2">
                        <label class="form-check-label" for="loyerRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!-----------------------------------------------Assurances--------------------------------------->
                <fieldset class="form-group assurances">
                    <legend class="col-form-label col-sm-2 pt-0">Assurances</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerAssurances"
                               id="assurancesNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="assurancesNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerAssurances"
                               id="assurancesNeutre"
                               value="0">
                        <label class="form-check-label" for="assurancesNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerAssurances"
                               id="assurancesRec"
                               value="3">
                        <label class="form-check-label" for="assurancesRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Santé--------------------------------------->
                <fieldset class="form-group sante">
                    <legend class="col-form-label col-sm-2 pt-0">Santé</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerSante"
                               id="santeNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="santeNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerSante"
                               id="santeNeutre"
                               value="0">
                        <label class="form-check-label" for="santeNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerSante"
                               id="santeRec"
                               value="2">
                        <label class="form-check-label" for="santeRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Véhicule(s)--------------------------------------->
                <fieldset class="form-group vehicule">
                    <legend class="col-form-label col-sm-2 pt-0">Véhicule(s)</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerVehicule"
                               id="vehiculeNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="vehiculeNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerVehicule"
                               id="vehiculeNeutre"
                               value="0">
                        <label class="form-check-label" for="vehiculeNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerVehicule"
                               id="vehiculeRec"
                               value="2">
                        <label class="form-check-label" for="vehiculeRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Transports--------------------------------------->
                <fieldset class="form-group transports">
                    <legend class="col-form-label col-sm-2 pt-0">Transports</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerTransports"
                               id="transportsNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="transportsNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerTransports"
                               id="transportsNeutre"
                               value="0">
                        <label class="form-check-label" for="transportsNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerTransports"
                               id="transportsRec"
                               value="2">
                        <label class="form-check-label" for="transportsRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Communications--------------------------------------->
                <fieldset class="form-group communications">
                    <legend class="col-form-label col-sm-2 pt-0">Communications</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerCommunications"
                               id="communicationsNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="communicationsNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerCommunications"
                               id="communicationsNeutre"
                               value="0">
                        <label class="form-check-label" for="communicationsNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerCommunications"
                               id="communicationsRec"
                               value="2">
                        <label class="form-check-label" for="communicationsRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Loisirs--------------------------------------->
                <fieldset class="form-group loisirs">
                    <legend class="col-form-label col-sm-2 pt-0">Loisirs</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerLoisirs"
                               id="loisirsNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="loisirsNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerLoisirs"
                               id="loisirsNeutre"
                               value="0">
                        <label class="form-check-label" for="loisirsNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerLoisirs"
                               id="loisirsRec"
                               value="2">
                        <label class="form-check-label" for="loisirsRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Nourritures--------------------------------------->
                <fieldset class="form-group nourritures">
                    <legend class="col-form-label col-sm-2 pt-0">Nourritures</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerNourritures"
                               id="nourrituresNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="nourrituresNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerNourritures"
                               id="nourrituresNeutre"
                               value="0">
                        <label class="form-check-label" for="nourrituresNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerNourritures"
                               id="nourrituresRec"
                               value="2">
                        <label class="form-check-label" for="nourrituresRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <!------------------------------------------------Dépenses quotidiennes--------------------------------------->
                <fieldset class="form-group depenses">
                    <legend class="col-form-label col-sm-2 pt-0">Dépenses quotidiennes</legend>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerDepenses"
                               id="depensesNonRec"
                               value="1" checked>
                        <label class="form-check-label" for="depensesNonRec">
                            Non recommandé
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerDepenses"
                               id="depensesNeutre"
                               value="0">
                        <label class="form-check-label" for="depensesNeutre">
                            Neutre
                        </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" name="offerDepenses"
                               id="depensesRec"
                               value="2">
                        <label class="form-check-label" for="depensesRec">
                            Recommandé
                        </label>
                    </div>
                </fieldset>
                <input type="submit" value="Enregistrer" class="btn btn-primary"/>
            </form>
        </div>
    </div>
</div>

<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>

</html>
