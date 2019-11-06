<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>

<!------------------------------------------------ Page modifier un produit ------------------------------------------->
<a href="admin.jsp">
    <button type="button" class="btn btn-link"><span class="retour">Retour</span></button>
</a>

<div class="container interface">

    <h1 class="h1-prospect">Modifier un produit</h1>

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
                <th scope="col">Nom</th>
                <th scope="col">Date de création</th>
                <th scope="col">Modifier</th>
                <th scope="col">Supprimer</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">Assurance</th>
                <td>04/11/2019</td>
                <td>
                    <button type="button" class="btn btn-outline-primary" data-toggle="modal"
                            data-target="#exampleModalEditProduct">
                        Modifier ce produit
                    </button>
                </td>
                <td>
                    <form class="" method="post">
                        <input name="inputHiddenValue" type="hidden" value="">
                        <input type="submit" class="btn btn-outline-danger" name="submittedDelProduct"
                               value="Supprimer ce produit">
                    </form>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
<!---------------------------------------------modal edit product--------------------------------------------------->
<div class="modal fade" id="exampleModalEditProduct" tabindex="-1" role="dialog"
     aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                    height="30"
                                                                    class="d-inline-block align-top" alt="">&nbsp;Modifier ce
                    produit</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <!------------------------------------ Form edit product ------------------------------------->
                <form>
                    <div class="form-group">
                        <label for="exampleInputName">Nom de l'offre</label>
                        <input type="text" class="form-control" id="exampleInputName"
                               aria-describedby="emailHelp"
                               placeholder="Nom">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputImportant">Priorité</label>
                        <select class="form-control" id="exampleInputImportant">
                            <option>Faible</option>
                            <option>Moyen</option>
                            <option>Forte</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputMin">Âge minimum</label>
                        <input class="form-control" type="number" value="18" id="exampleInputMin">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputMax">Âge maximum</label>
                        <input class="form-control" type="number" value="60" id="exampleInputMax">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputRecommandedAge">Plage d'âge recommandé</label>
                        <input class="form-control" type="number" value="18" id="exampleInputRecommandedAge">
                        <input class="form-control" type="number" value="60" id="exampleInputRecommandedAge2">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputRecommandedSalary">Salaire Brut recommandé</label>
                        <input class="form-control" type="number" value="1270" id="exampleInputRecommandedSalary">
                        <input class="form-control" type="number" value="2000" id="exampleInputRecommandedSalary2">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputFamilySituation">Situation familiale recommandé</label>
                        <select class="form-control" id="exampleInputFamilySituation">
                            <option>Célibataire</option>
                            <option>Marié</option>
                            <option>Divorcé</option>
                            <option>Veuf</option>
                            <option>Pacsé</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputProSituation">Situation professionnelle recommandé</label>
                        <select class="form-control" id="exampleInputProSituation">
                            <option>Demandeur d'emploi</option>
                            <option>Étudiant</option>
                            <option>Indépendant</option>
                            <option>Employé/Ouvrier</option>
                            <option>Cadre</option>
                            <option>Fonctionnaire</option>
                        </select>
                    </div>
                    <!------------------------------------------------Les types de dépenses--------------------------------------->
                    <h5>Les types de dépense</h5>
                    <!------------------------------------------------Loyer--------------------------------------->
                    <fieldset class="form-group loyer">
                        <legend class="col-form-label col-sm-2 pt-0">Loyer</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="loyer"
                                   id="loyerNonRec"
                                   value="loyerNonRec" checked>
                            <label class="form-check-label" for="loyerNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="loyer"
                                   id="loyerNeutre"
                                   value="loyerNeutre">
                            <label class="form-check-label" for="loyerNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="loyer"
                                   id="loyerRec"
                                   value="loyerRec">
                            <label class="form-check-label" for="loyerRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!-----------------------------------------------Assurances--------------------------------------->
                    <fieldset class="form-group assurances">
                        <legend class="col-form-label col-sm-2 pt-0">Assurances</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="assurances"
                                   id="assurancesNonRec"
                                   value="assurancesNonRec" checked>
                            <label class="form-check-label" for="assurancesNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="assurances"
                                   id="assurancesNeutre"
                                   value="assurancesNeutre">
                            <label class="form-check-label" for="assurancesNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="assurances"
                                   id="assurancesRec"
                                   value="assurancesRec">
                            <label class="form-check-label" for="assurancesRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Santé--------------------------------------->
                    <fieldset class="form-group sante">
                        <legend class="col-form-label col-sm-2 pt-0">Santé</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="sante"
                                   id="santeNonRec"
                                   value="santeNonRec" checked>
                            <label class="form-check-label" for="santeNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="sante"
                                   id="santeNeutre"
                                   value="santeNeutre">
                            <label class="form-check-label" for="santeNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="sante"
                                   id="santeRec"
                                   value="santeRec">
                            <label class="form-check-label" for="santeRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Véhicule(s)--------------------------------------->
                    <fieldset class="form-group vehicule">
                        <legend class="col-form-label col-sm-2 pt-0">Véhicule(s)</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="vehicule"
                                   id="vehiculeNonRec"
                                   value="vehiculeNonRec" checked>
                            <label class="form-check-label" for="vehiculeNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="vehicule"
                                   id="vehiculeNeutre"
                                   value="vehiculeNeutre">
                            <label class="form-check-label" for="vehiculeNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="vehicule"
                                   id="vehiculeRec"
                                   value="vehiculeRec">
                            <label class="form-check-label" for="vehiculeRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Transports--------------------------------------->
                    <fieldset class="form-group transports">
                        <legend class="col-form-label col-sm-2 pt-0">Transports</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="transports"
                                   id="transportsNonRec"
                                   value="transportsNonRec" checked>
                            <label class="form-check-label" for="transportsNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="transports"
                                   id="transportsNeutre"
                                   value="transportsNeutre">
                            <label class="form-check-label" for="transportsNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="transports"
                                   id="transportsRec"
                                   value="transportsRec">
                            <label class="form-check-label" for="transportsRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Communications--------------------------------------->
                    <fieldset class="form-group communications">
                        <legend class="col-form-label col-sm-2 pt-0">Communications</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="communications"
                                   id="communicationsNonRec"
                                   value="communicationsNonRec" checked>
                            <label class="form-check-label" for="communicationsNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="communications"
                                   id="communicationsNeutre"
                                   value="communicationsNeutre">
                            <label class="form-check-label" for="communicationsNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="communications"
                                   id="communicationsRec"
                                   value="communicationsRec">
                            <label class="form-check-label" for="communicationsRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Loisirs--------------------------------------->
                    <fieldset class="form-group loisirs">
                        <legend class="col-form-label col-sm-2 pt-0">Loisirs</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="loisirs"
                                   id="loisirsNonRec"
                                   value="loisirsNonRec" checked>
                            <label class="form-check-label" for="loisirsNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="loisirs"
                                   id="loisirsNeutre"
                                   value="loisirsNeutre">
                            <label class="form-check-label" for="loisirsNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="loisirs"
                                   id="loisirsRec"
                                   value="loisirsRec">
                            <label class="form-check-label" for="loisirsRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Nourritures--------------------------------------->
                    <fieldset class="form-group nourritures">
                        <legend class="col-form-label col-sm-2 pt-0">Nourritures</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="nourritures"
                                   id="nourrituresNonRec"
                                   value="nourrituresNonRec" checked>
                            <label class="form-check-label" for="nourrituresNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="nourritures"
                                   id="nourrituresNeutre"
                                   value="nourrituresNeutre">
                            <label class="form-check-label" for="nourrituresNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="nourritures"
                                   id="nourrituresRec"
                                   value="nourrituresRec">
                            <label class="form-check-label" for="nourrituresRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <!------------------------------------------------Dépenses quotidiennes--------------------------------------->
                    <fieldset class="form-group depenses">
                        <legend class="col-form-label col-sm-2 pt-0">Dépenses quotidiennes</legend>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="depenses"
                                   id="depensesNonRec"
                                   value="depensesNonRec" checked>
                            <label class="form-check-label" for="depensesNonRec">
                                Non recommmandé
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="depenses"
                                   id="depensesNeutre"
                                   value="depensesNeutre">
                            <label class="form-check-label" for="depensesNeutre">
                                Neutre
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="depenses"
                                   id="depensesRec"
                                   value="depensesRec">
                            <label class="form-check-label" for="depensesRec">
                                Recommandé
                            </label>
                        </div>
                    </fieldset>
                    <button type="submit" class="btn btn-primary">Enregistrer les modifications</button>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
            </div>
        </div>
    </div>
</div>
<!-------------------------------------------------- Dark mode -------------------------------------------------------->
<%@include file="partials/dark_mode.jsp" %>

</body>

</html>
