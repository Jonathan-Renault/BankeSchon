<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="partials/header.jsp" %>
<!--------------------------------------------------- Modal contact --------------------------------------------------->
<%@include file="partials/modal_contact.jsp" %>

<!------------------------------------------------- interface ------------------------------------------------->
<div class="container interface">

    <h1 class="h1-prospect">Prochain prospect à contacter</h1>
    <!------------------------------------------- Tableau de 10 prospect ---------------------------------------------->

    <div id="table-prospect">
        <table class="table table-hover table-part1">
            <tbody>
            <tr>
                <td>Nom</td>
                <td class="lighter">Charles</td>
            </tr>
            <tr>
                <td>Prénom</td>
                <td class="lighter">Edward</td>
            </tr>
            <tr>
                <td>Téléphone</td>
                <td class="lighter">06.12.34.56.78</td>
            </tr>
            <tr>
                <td>Date de naissance</td>
                <td class="lighter">13.06.1995</td>
            </tr>
            <tr>
                <td>Situation familiale</td>
                <td class="lighter">Célibataire</td>
            </tr>
            <tr>
                <td>Offre(s) proposée(s)</td>
                <td class="lighter">
                    <button type="button" class="btn btn-link" data-toggle="modal"
                            data-target="#exampleModalOfferDetails">
                        Détails
                    </button>
                </td>
            </tr>
            </tbody>
        </table>
        <table class="table table-hover table-part2">
            <tbody>
            <tr>
                <td>Situation professionnelle</td>
                <td class="lighter">Recherche d'emploi
                </td>
            </tr>
            <tr>
                <td>Dernier appel</td>
                <td class="lighter">Datetime</td>
            </tr>
            <tr>
                <td>Nombre d'appel</td>
                <td class="lighter">Number</td>
            </tr>
            <tr>
                <td>Offre adaptée</td>
                <td class="lighter">Pôle emploi ?</td>
            </tr>
            <tr>
                <td>Salaire Net Mensuel</td>
                <td class="lighter">1€</td>
            </tr>
            <tr>
                <td>Type de dépenses régulières</td>
                <td class="lighter">
                    <button type="button" class="btn btn-link" id="popover" data-toggle="modal"
                            data-target="#exampleModalDepenseDetails">
                        Détails
                    </button>
                </td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="clear"></div>

    <div class="btns">
        <button type="button" class="btn btn-outline-danger" data-toggle="modal" data-target="#">
            Refus
        </button>

        <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModalEdit">
            Modifier ce profil
        </button>

        <button type="button" class="btn btn-outline-success" data-toggle="modal" data-target="#exampleModalValidation">
            Validation
        </button>
    </div>

    <div class="modal fade" id="exampleModalEdit" tabindex="-1" role="dialog"
         aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                        height="30"
                                                                        class="d-inline-block align-top" alt="">&nbsp;
                        Modifier ce profil</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <!------------------------------------ Form edit profil ------------------------------------->
                    <form>
                        <div class="form-group">
                            <label for="exampleInputName">Nom</label>
                            <input type="text" class="form-control" id="exampleInputName"
                                   aria-describedby="emailHelp"
                                   placeholder="Nom">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputSurname">Prénom</label>
                            <input type="text" class="form-control" id="exampleInputSurname"
                                   aria-describedby="emailHelp"
                                   placeholder="Prénom">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputTel">Téléphone</label>
                            <input class="form-control" type="tel" value="1-(555)-555-5555"
                                   id="exampleInputTel">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputBirthday">Date de naissance</label>
                            <input class="form-control" type="date" value="1998-08-19"
                                   id="exampleInputBirthday">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputFamilySituation">Situation familiale</label>
                            <select class="form-control" id="exampleInputFamilySituation">
                                <option>Célibataire</option>
                                <option>Marié</option>
                                <option>Divorcé</option>
                                <option>Veuf</option>
                                <option>Pacsé</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputProSituation">Situation professionnelle</label>
                            <select class="form-control" id="exampleInputProSituation">
                                <option>Demandeur d'emploi</option>
                                <option>Étudiant</option>
                                <option>Indépendant</option>
                                <option>Employé/Ouvrier</option>
                                <option>Cadre</option>
                                <option>Fonctionnaire</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputSalaire">Salaire Brut</label>
                            <input class="form-control" type="number" value="1521" id="exampleInputSalaire">
                        </div>
                        <h6>Acceptez-vous d'être rappelé pour de prochaines offres ?</h6>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="exampleRadios"
                                   id="exampleRadios1"
                                   value="option1" checked>
                            <label class="form-check-label" for="exampleRadios1">
                                Oui
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="exampleRadios"
                                   id="exampleRadios2"
                                   value="option2">
                            <label class="form-check-label" for="exampleRadios2">
                                Non
                            </label>
                        </div>
                        <br/>

                        <h6>Quels sont les types de produit déjà proposé ?</h6>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxCompteCourant"
                                   value="option1">
                            <label class="form-check-label" for="inlineCheckboxCompteCourant">Compte
                                courant</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxLivretJeune"
                                   value="option2">
                            <label class="form-check-label" for="inlineCheckboxLivretJeune">Livret jeune</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxLivretA"
                                   value="option1">
                            <label class="form-check-label" for="inlineCheckboxLivretA">Livret A</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxPEL"
                                   value="option2">
                            <label class="form-check-label" for="inlineCheckboxPEL">PEL</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxAssuranceVie"
                                   value="option1">
                            <label class="form-check-label" for="inlineCheckboxAssuranceVie">Assurance
                                vie</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxCreditConso"
                                   value="option2">
                            <label class="form-check-label" for="inlineCheckboxCreditConso">Crédit
                                consommation</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxCreditImmo"
                                   value="option1">
                            <label class="form-check-label" for="inlineCheckboxCreditImmo">Crédit
                                immobilié</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxCreditAuto"
                                   value="option2">
                            <label class="form-check-label" for="inlineCheckboxCreditAuto">Crédit
                                automobile</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="inlineCheckboxCreditEtudiant"
                                   value="option1">
                            <label class="form-check-label" for="inlineCheckboxCreditEtudiant">Crédit
                                étudiant</label>
                        </div>
                        <br/> <br/>
                        <button type="submit" class="btn btn-primary">Enregistrer les modifications</button>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                </div>
            </div>
        </div>
    </div>
    <!------------------------------------------------- Modal validation ------------------------------------------------->

    <div class="modal fade" id="exampleModalValidation" tabindex="-1" role="dialog"
         aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                        height="30"
                                                                        class="d-inline-block align-top" alt="">&nbsp;
                        Inscrire ce prospect</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <!------------------------------------ Form edit profil ------------------------------------->
                    <form>
                        <div class="form-group">
                            <label for="exampleInputName">Nom</label>
                            <input type="email" class="form-control" id="exampleInputName"
                                   aria-describedby="emailHelp"
                                   placeholder="Nom">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputSurname">Prénom</label>
                            <input type="email" class="form-control" id="exampleInputSurname"
                                   aria-describedby="emailHelp"
                                   placeholder="Prénom">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputTel">Téléphone</label>
                            <input class="form-control" type="tel" value="1-(555)-555-5555"
                                   id="exampleInputTel">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputBirthday">Date de naissance</label>
                            <input class="form-control" type="date" value="1998-08-19"
                                   id="exampleInputBirthday">
                        </div>
                        <div class="form-group">
                            <label for="exampleInputFamilySituation">Situation familiale</label>
                            <select class="form-control" id="exampleInputFamilySituation">
                                <option>Célibataire</option>
                                <option>Marié</option>
                                <option>Divorcé</option>
                                <option>Veuf</option>
                                <option>Pacsé</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputProSituation">Situation professionnelle</label>
                            <select class="form-control" id="exampleInputProSituation">
                                <option>Demandeur d'emploi</option>
                                <option>Étudiant</option>
                                <option>Indépendant</option>
                                <option>Employé/Ouvrier</option>
                                <option>Cadre</option>
                                <option>Fonctionnaire</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="exampleInputValidation">À quel type de contrat le prospect souscrit ?</label>
                            <select class="form-control" id="exampleInputValidation">
                                <option>Compte courant</option>
                                <option>Livret jeune</option>
                                <option>Livret A</option>
                                <option>PEL</option>
                                <option>Assurance vie</option>
                                <option>Crédit consommation</option>
                                <option>Crédit immobilié</option>
                                <option>Crédit automobile</option>
                                <option>Crédit étudiant</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-success">Inscrire ce prospect</button>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                </div>
            </div>
        </div>
    </div>

</div>

<!------------------------------------------------- Modal Depense Details ------------------------------------------------->
<div class="modal fade" id="exampleModalDepenseDetails" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                    height="30"
                                                                    class="d-inline-block align-top" alt="">&nbsp;
                    Détails des dépenses</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <!------------------------------------ Table Depense Details ------------------------------------->
                <ul class="list-group">
                    <li class="list-group-item">Véhicules</li>
                    <li class="list-group-item">Alimentations</li>
                    <li class="list-group-item">Loisirs</li>
                </ul>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
            </div>
        </div>
    </div>
</div>
<!------------------------------------------------- Modal Offer Details ------------------------------------------------->
<div class="modal fade" id="exampleModalOfferDetails" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel"><img src="img/bankeschon_logo.svg" width="30"
                                                                    height="30"
                                                                    class="d-inline-block align-top" alt="">&nbsp;
                    Détails des offres</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <!------------------------------------ Table Offer Details ------------------------------------->
                <ul class="list-group">
                    <li class="list-group-item">Compte courant</li>
                    <li class="list-group-item">Livret jeune</li>
                    <li class="list-group-item">Livret A</li>
                    <li class="list-group-item">PEL</li>
                    <li class="list-group-item">Assurance vie</li>
                </ul>
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