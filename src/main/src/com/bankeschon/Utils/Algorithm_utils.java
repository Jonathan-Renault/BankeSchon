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

    public boolean checkCorrectAge (Integer prospect_age, Integer offer_id) {
        Offer _object = new Offer();
        List<Offer> result;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("minimum_age");
        fields.add("maximum_age");
        filters.add(filter.add("=", "id", offer_id));
        result = Database.select(_object,fields,filters);
        return (result.get(0).getMinimum_age() <= prospect_age) && (result.get(0).getMaximum_age() >= prospect_age);
    }

    public Integer checkOfferInfoParameter (Prospect prospect,Integer score, String column, Integer id_offer) {
        Offer _object = new Offer();
        List<Offer> result;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add("recommanded_"+column);
        filters.add(filter.add("=", "id", id_offer));
        result = Database.select(_object, fields, filters);

        if (column.equals("age") || column.equals("salary")) {
            switch (column) {
                case "age":
                    String[] recommandedAges = result.get(0).getRecommanded_age().split("-", 2);
                    if (prospect.age <= Integer.parseInt(recommandedAges[0]) && prospect.age >= Integer.parseInt(recommandedAges[1]))
                        return score+1;
                    else
                        return score;

                case "salary":
                    String[] recommandedSalaries = result.get(0).getRecommanded_salary().split("-", 2);
                    if (prospect.getSalary() <= Integer.parseInt(recommandedSalaries[0]) && prospect.getSalary() >= Integer.parseInt(recommandedSalaries[1]))
                        return score+1;
                    else
                        return score;
            }
        } else if (column.equals("familial_situation") || column.equals("pro_situation")) {
            switch (column) {
                case "familial_situation":
                    if (prospect.getFamily_situation().equals(result.get(0).getRecommanded_familial_situation()))
                        return score+1;
                    else
                        return score;
                case "pro_situation":
                    if (prospect.getProfessional_situation().equals(result.get(0).getRecommanded_pro_situation()))
                        return score+1;
                    else
                        return score;
            }
        } else
            System.out.println("Erreur lors de la comparaison des infos client avec l'offre en cours (mauvais nom de colonne");
        return score;
    }

    public Integer checkOfferSpendsParameter(Prospect prospect, Integer score, String column, Integer id_offer) {

        return score;
    }
}
