package com.bankeschon.Utils;

import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Prospect;
import com.bankeschon.Models.Offer_history;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Algorithm_utils {
    public Prospect lastProspectModified (Integer id) {
        Prospect _object = new Prospect();
        Prospect prospect;
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

    public List<Offer> getAllOffers () {
        Offer _object = new Offer();
        List offers;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("*");
        filters.add(filter.add("=", "1", "1"));
        offers = Database.select(_object, fields, filters);
        Offer offer = (Offer) offers.get(0);
        System.out.println(offer.getCreated_at());
        return offers;
    }

    public Integer findAge (String birthday) {
        String[] values = birthday.split("-", 0);
        LocalDate birthdate = LocalDate.of(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
        LocalDate actualDate = LocalDate.now();
        Period difference = Period.between(birthdate, actualDate);
        return difference.getYears();
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

    }*/
}
