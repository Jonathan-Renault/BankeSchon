package com.bankeschon.Utils;

import com.bankeschon.Models.BaseModelORM;
import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Prospect;
import com.bankeschon.Models.Offer_history;

import java.util.ArrayList;
import java.util.List;

public class Algorithm_utils {
    public List lastProspectModified (Integer id) {
        BaseModelORM _object = new Prospect();
        _object.getTableName();
        List prospect;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList<String> filter = new ArrayList<String>();
        fields.add("*");
        filter.add("id =" + id);
        prospect = Database.select(_object, fields, filter);
        return prospect;
    }

    public boolean checkOffersProposed (Integer prospect_id, String offer_id) {
        List result;
        BaseModelORM _object = new Offer_history();
        _object.getTableName();
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList<String> filter = new ArrayList<String>();
        fields.add("accepted");
        filter.add("id_prospect =" + prospect_id + "AND accepted = true AND id_offer =" + offer_id);
        result = Database.select(_object, fields, filter);

        return result.isEmpty();
    }

    public boolean checkCorrectAge (Integer prospect_id, String offer_id) {
        List result;
        BaseModelORM _objectProspect = new Prospect();
        BaseModelORM _objectOffer = new Offer();
        ArrayList<String> fieldsProspect = new ArrayList<String>();
        ArrayList<String> filterProspect = new ArrayList<String>();
        ArrayList<String> fieldsOffer = new ArrayList<String>();
        ArrayList<String> filterOffer = new ArrayList<String>();
        fieldsProspect.add("birthdate");
        fieldsOffer.add("");
    }
}
