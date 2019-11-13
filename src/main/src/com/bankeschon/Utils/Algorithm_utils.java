package com.bankeschon.Utils;

import com.bankeschon.Models.BaseModelORM;
import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Prospect;
import com.bankeschon.Models.Offer_history;

import java.util.ArrayList;
import java.util.List;

public class Algorithm_utils {
    public Prospect lastProspectModified (Integer id) {
        Prospect _object = new Prospect();
        Prospect prospect = new Prospect();
        List prospects;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("*");
        filters.add(filter.add("=","id", id));
        prospects = Database.select(_object, fields, filters);
        prospect = (Prospect) prospects.get(0);

        return prospect;
    }

    public List getAllOffers () {
        Offer _object = new Offer();
        List offers;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("*");
        filters.add(filter.add("=", "1", "1"));
        offers = Database.select(_object, fields, filters);

        return offers;
    }

    public boolean checkOffersProposed (Integer prospect_id, Integer offer_id) {
        Offer_history _object = new Offer_history();
        List<Offer> result;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("accepted");
        filters.add(filter.add("=","id_prospect", prospect_id));
        filters.add(filter.add("=","accepted", true));
        filters.add(filter.add("=","id_offer", offer_id));
        result = Database.select(_object, fields, filters);

        return result.isEmpty();
    }

    /*public boolean checkCorrectAge (Integer prospect_id, String offer_id) {
        List result;
        BaseModelORM _objectProspect = new Prospect();
        BaseModelORM _objectOffer = new Offer();
        ArrayList<String> fieldsProspect = new ArrayList<String>();
        ArrayList<String> filterProspect = new ArrayList<String>();
        ArrayList<String> fieldsOffer = new ArrayList<String>();
        ArrayList<String> filterOffer = new ArrayList<String>();
        fieldsProspect.add("birthday");
        fieldsOffer.add("");
    }*/
}
