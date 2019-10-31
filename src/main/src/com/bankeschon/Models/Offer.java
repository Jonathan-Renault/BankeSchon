package main.src.com.bankeschon.Models;

import java.util.UUID;

public class Offer {
    private String tableName = "offers";

    private UUID _id;
    private String offer_name;
    private Integer priority; // de 0 à 3
    private Integer minimum_age;
    private Integer maximum_age;
    private String recommanded_age; // plage d'âge, séparé par - (exemple: 18-30)
    private Integer salary; // plage de salaire, séparé par - (exemple: 1000-2000)
    private Integer recommanded_familial_situation; // 0 = celibataire, 1 = marié/pacsé, 2 = divorcé/veuf
    private Integer recommanded_pro_situation; // 0 = sans emploi, 1 = employé, 2 = cadre, 3 = fonctionnaire, 4 = indé

    // 0 = neutre, 1 = recommandé, 2 = non recommandé
    private Integer rent_spend_recommanded;
    private Integer insurance_spend_recommanded;
    private Integer health_spend_recommanded;
    private Integer car_spend_recommanded;
    private Integer transport_spend_recommanded;
    private Integer communication_spend_recommanded;
    private Integer hobby_spend_recommanded;
    private Integer food_spend_recommanded;
    private Integer daily_spend_recommanded;
    //

    private String   created_at; // à convertir en timestamp
    private String   updated_at; // à convertir en timestamp

    public UUID get_id() {
        return _id;
    }

    public Offer set_id(UUID _id) {
        this._id = _id;

        return this;
    }

    public String getOffer_name() {
        return offer_name;
    }

    public Offer setOffer_name(String offer_name) {
        this.offer_name = offer_name;

        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public Offer setPriority(Integer priority) {
        this.priority = priority;

        return this;
    }

    public Integer getMinimum_age() {
        return minimum_age;
    }

    public Offer setMinimum_age(Integer minimum_age) {
        this.minimum_age = minimum_age;

        return this;
    }

    public Integer getMaximum_age() {
        return maximum_age;
    }

    public Offer setMaximum_age(Integer maximum_age) {
        this.maximum_age = maximum_age;

        return this;
    }

    public String getRecommanded_age() {
        return recommanded_age;
    }

    public Offer setRecommanded_age(String recommanded_age) {
        this.recommanded_age = recommanded_age;

        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Offer setSalary(Integer salary) {
        this.salary = salary;

        return this;
    }

    public Integer getRecommanded_familial_situation() {
        return recommanded_familial_situation;
    }

    public Offer setRecommanded_familial_situation(Integer recommanded_familial_situation) {
        this.recommanded_familial_situation = recommanded_familial_situation;

        return this;
    }

    public Integer getRecommanded_pro_situation() {
        return recommanded_pro_situation;
    }

    public Offer setRecommanded_pro_situation(Integer recommanded_pro_situation) {
        this.recommanded_pro_situation = recommanded_pro_situation;

        return this;
    }

    public Integer getRent_spend_recommanded() {
        return rent_spend_recommanded;
    }

    public Offer setRent_spend_recommanded(Integer rent_spend_recommanded) {
        this.rent_spend_recommanded = rent_spend_recommanded;

        return this;
    }

    public Integer getInsurance_spend_recommanded() {
        return insurance_spend_recommanded;
    }

    public Offer setInsurance_spend_recommanded(Integer insurance_spend_recommanded) {
        this.insurance_spend_recommanded = insurance_spend_recommanded;

        return this;
    }

    public Integer getHealth_spend_recommanded() {
        return health_spend_recommanded;
    }

    public Offer setHealth_spend_recommanded(Integer health_spend_recommanded) {
        this.health_spend_recommanded = health_spend_recommanded;

        return this;
    }

    public Integer getCar_spend_recommanded() {
        return car_spend_recommanded;
    }

    public Offer setCar_spend_recommanded(Integer car_spend_recommanded) {
        this.car_spend_recommanded = car_spend_recommanded;

        return this;
    }

    public Object getTransport_spend_recommanded() {
        return transport_spend_recommanded;
    }

    public Offer setTransport_spend_recommanded(Integer transport_spend_recommanded) {
        this.transport_spend_recommanded = transport_spend_recommanded;

        return this;
    }

    public Integer getCommunication_spend_recommanded() {
        return communication_spend_recommanded;
    }

    public Offer setCommunication_spend_recommanded(Integer communication_spend_recommanded) {
        this.communication_spend_recommanded = communication_spend_recommanded;

        return this;
    }

    public Integer getHobby_spend_recommanded() {
        return hobby_spend_recommanded;
    }

    public Offer setHobby_spend_recommanded(Integer hobby_spend_recommanded) {
        this.hobby_spend_recommanded = hobby_spend_recommanded;

        return this;
    }

    public Integer getFood_spend_recommanded() {
        return food_spend_recommanded;
    }

    public Offer setFood_spend_recommanded(Integer food_spend_recommanded) {
        this.food_spend_recommanded = food_spend_recommanded;

        return this;
    }

    public Integer getDaily_spend_recommanded() {
        return daily_spend_recommanded;
    }

    public Offer setDaily_spend_recommanded(Integer daily_spend_recommanded) {
        this.daily_spend_recommanded = daily_spend_recommanded;

        return this;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Offer setCreated_at(String created_at) {
        this.created_at = created_at;

        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Offer setUpdated_at(String updated_at) {
        this.updated_at = updated_at;

        return this;
    }
}
