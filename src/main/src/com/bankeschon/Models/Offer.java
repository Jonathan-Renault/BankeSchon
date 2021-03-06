package com.bankeschon.Models;

import java.sql.Timestamp;

public class Offer extends BaseModelORM {
    private String tableName = "offers";

    private Integer id;
    private String offer_name;
    private Integer priority;
    private Integer minimum_age;
    private Integer maximum_age;

    private String recommanded_age; // plage d'âge, séparé par - (exemple: 18-30)
    private String recommanded_salary; // plage de salaire, séparé par - (exemple: 1000-2000)
    private Integer recommanded_family_situation; // 0 = celibataire, 1 = marié/pacsé, 2 = divorcé/veuf
    private Integer recommanded_pro_situation; // 0 = sans emploi, 1 = employé, 2 = cadre, 3 = fonctionnaire, 4 = indé

    private Integer rent_spend_recommanded;
    private Integer insurance_spend_recommanded;
    private Integer health_spend_recommanded;
    private Integer car_spend_recommanded;
    private Integer transport_spend_recommanded;
    private Integer communication_spend_recommanded;
    private Integer hobby_spend_recommanded;
    private Integer food_spend_recommanded;
    private Integer daily_spend_recommanded;

    private Timestamp created_at;
    private Timestamp updated_at;

    @Override
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Integer getId() {
        return id;
    }

    public Offer setId(Integer id) {
        this.id = id;
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

    public String getRecommanded_salary() {
        return recommanded_salary;
    }

    public Offer setRecommanded_salary(String recommanded_salary) {
        this.recommanded_salary = recommanded_salary;
        return this;
    }

    public Integer getRecommanded_family_situation() {
        return recommanded_family_situation;
    }

    public Offer setRecommanded_family_situation(Integer recommanded_family_situation) {
        this.recommanded_family_situation = recommanded_family_situation;
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

    public Integer getTransport_spend_recommanded() {
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

    public Timestamp getCreated_at() {
        return created_at;
    }

    public Offer setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
        return this;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public Offer setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
        return this;
    }

}