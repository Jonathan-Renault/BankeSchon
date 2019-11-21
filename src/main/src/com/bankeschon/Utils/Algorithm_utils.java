package com.bankeschon.Utils;


import com.bankeschon.Models.Offer;
import com.bankeschon.Models.Offer_score;
import com.bankeschon.Models.Prospect;
import com.bankeschon.Models.Offer_history;
import com.bankeschon.Models.Offer;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

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

    public Integer checkOfferInfoParameter (Prospect prospect, Integer age,Integer score, String column, Integer id_offer) {
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
                    if (age <= Integer.parseInt(recommandedAges[0]) && age >= Integer.parseInt(recommandedAges[1]))
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
        } else if (column.equals("family_situation") || column.equals("pro_situation")) {
            switch (column) {

                case "family_situation":
                    if (result.get(0).getRecommanded_family_situation() == 4)
                        return score+1;

                    if (prospect.getFamily_situation().equals(result.get(0).getRecommanded_family_situation()))
                        return score+1;
                    else
                        return score;
                case "pro_situation":
                    if (result.get(0).getRecommanded_pro_situation() == 6)
                        return score+1;
                    if (prospect.getProfessional_situation().equals(result.get(0).getRecommanded_pro_situation()))
                        return score+1;
                    else
                        return score;
            }
        } else
            System.out.println("Erreur lors de la comparaison des infos client avec l'offre en cours (mauvais nom de colonne)");
        return score;
    }

    public Integer checkOfferSpendsParameter(Prospect prospect, Integer score, String column, Integer id_offer) {
        if (prospect.getSpendings() == null) {
            System.out.println("Erreur lors de la comparaison des infos client avec l'offre en cours (le client n'a pas de dépenses régulières renseignées)");
            return score;
        }
        String[] regularSpends = prospect.getSpendings().split("-", 3);
        Boolean isRegular = false;
        Offer _object = new Offer();
        List<Offer> result;
        ArrayList<String> fields = new ArrayList<String>();
        ArrayList filters = new ArrayList<String>();
        Filter filter = new Filter();
        fields.add(column +"_spend_recommanded");
        filters.add(filter.add("=", "id", id_offer));
        result = Database.select(_object, fields, filters);
        switch (column) {
            case "rent":
                if (regularSpends[0].equals("rent") || regularSpends[1].equals("rent") || regularSpends[2].equals("rent"))
                    isRegular = true;

                if (result.get(0).getRent_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getRent_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getRent_spend_recommanded() == 2)
                    return score-1;

            case "insurance":
                if (regularSpends[0].equals("insurance") || regularSpends[1].equals("insurance") || regularSpends[2].equals("insurance"))
                    isRegular = true;

                if (result.get(0).getInsurance_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getInsurance_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getInsurance_spend_recommanded() == 2)
                    return score-1;

            case "health":
                if (regularSpends[0].equals("health") || regularSpends[1].equals("health") || regularSpends[2].equals("health"))
                    isRegular = true;

                if (result.get(0).getHealth_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getHealth_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getHealth_spend_recommanded() == 2)
                    return score-1;

            case "car":
                if (regularSpends[0].equals("car") || regularSpends[1].equals("car") || regularSpends[2].equals("car"))
                    isRegular = true;

                if (result.get(0).getCar_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getCar_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getCar_spend_recommanded() == 2)
                    return score-1;

            case "transport":
                if (regularSpends[0].equals("transport") || regularSpends[1].equals("transport") || regularSpends[2].equals("transport"))
                    isRegular = true;

                if (result.get(0).getTransport_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getTransport_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getTransport_spend_recommanded() == 2)
                    return score-1;

            case "communication":
                if (regularSpends[0].equals("communication") || regularSpends[1].equals("communication") || regularSpends[2].equals("communication"))
                    isRegular = true;

                if (result.get(0).getCommunication_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getCommunication_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getCommunication_spend_recommanded() == 2)
                    return score-1;

            case "hobby":
                if (regularSpends[0].equals("hobby") || regularSpends[1].equals("hobby") || regularSpends[2].equals("hobby"))
                    isRegular = true;

                if (result.get(0).getHobby_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getHobby_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getHobby_spend_recommanded() == 2)
                    return score-1;

            case "food":
                if (regularSpends[0].equals("food") || regularSpends[1].equals("food") || regularSpends[2].equals("food"))
                    isRegular = true;

                if (result.get(0).getFood_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getFood_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getFood_spend_recommanded() == 2)
                    return score-1;

            case "daily":
                if (regularSpends[0].equals("daily") || regularSpends[1].equals("daily") || regularSpends[2].equals("daily"))
                    isRegular = true;

                if (result.get(0).getDaily_spend_recommanded() == null) {
                    if (isRegular)
                        return score;
                } else if (result.get(0).getDaily_spend_recommanded() == 1) {
                    if (isRegular)
                        return score+1;
                } else if (result.get(0).getDaily_spend_recommanded() == 2)
                    return score-1;
        }
        System.out.println("Erreur lors de la comparaison des infos client avec l'offre en cours (mauvais nom de colonne)");
        return score;
    }

    public void updateOffersRecommanded (String firstOffer, String secondOffer, String thirdOffer, Prospect prospect) {
        String offersRecommanded = (firstOffer + "-" +secondOffer + "-" + thirdOffer);
        Timestamp time = new Timestamp(System.currentTimeMillis());
        prospect.setId(prospect.getId())
                .setIs_customer(prospect.getIs_customer())
                .setName(prospect.getName())
                .setSurname(prospect.getSurname())
                .setBirthday(prospect.getBirthday())
                .setTel(prospect.getTel())
                .setMail(prospect.getMail())
                .setLast_contact(prospect.getLast_contact())
                .setCan_be_contacted(prospect.getCan_be_contacted())
                .setFamily_situation(prospect.getFamily_situation())
                .setProfessional_situation(prospect.getProfessional_situation())
                .setSalary(prospect.getSalary())
                .setSpendings(prospect.getSpendings())
                .setAdapted_offers(offersRecommanded)
                .setCreated_at(prospect.getCreated_at())
                .setUpdated_at(time);
        Database.updateId(prospect, prospect.getId());
    }
}
