package main.src.com.bankeschon.Models;

import java.util.UUID;

public class Offer {
    public UUID _id;
    public String offer_name;
    public Integer priority; // de 0 à 3
    public Integer minimum_age;
    public Integer maximum_age;
    public String recommanded_age; // plage d'âge, séparé par - (exemple: 18-30)
    public Integer salary; // plage de salaire, séparé par - (exemple: 1000-2000)
    public Integer recommanded_familial_situation; // 0 = celibataire, 1 = marié/pacsé, 2 = divorcé/veuf
    public Integer recommanded_pro_situation; // 0 = sans emploi, 1 = employé, 2 = cadre, 3 = fonctionnaire, 4 = indé

    // 0 = neutre, 1 = recommandé, 2 = non recommandé
    public Integer rent_spend_recommanded;
    public Integer insurance_spend_recommanded;
    public Integer health_spend_recommanded;
    public Integer car_spend_recommanded;
    public Integer transport_spend_recommanded;
    public Integer communication_spend_recommanded;
    public Integer hobby_spend_recommanded;
    public Integer food_spend_recommanded;
    public Integer daily_spend_recommanded;
    //

    public String   created_at; // à convertir en timestamp
    public String   updated_at; // à convertir en timestamp
}
