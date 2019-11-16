package com.bankeschon.Models;

public class Prospect extends BaseModelORM {
    private String tableName = "prospects";

    private Integer  id;
    private Integer  is_customer;
    private String   name;
    private String   surname;
    private String   birthday; // à convertir en datetime
    private String   tel;
    private String   mail;
    private String   last_contact; // à convertir en timestamp
    private Boolean  can_be_contacted;
    private Integer  family_situation; // 0 = celibataire, 1 = marié/pacsé, 2 = divorcé/veuf
    private Integer  professional_situation; // 0 = sans emploi, 1 = employé, 2 = cadre, 3 = fonctionnaire, 4 = indé
    private Integer  professional_contract_type; // 0 = interim, 1 = CDD, 2 = CDI
    private Integer  salary;
    private String   spendings; // 3, séparés par des -
    private String   adapted_offers; // 3 maximum, séparés par des -
    private String   created_at; // à convertir en timestamp
    private String   updated_at; // à convertir en timestamp

    public Integer  age;

    public Integer getId() {
        return id;
    }

    public Prospect setId(Integer id) {
        this.id = id;

        return this;
    }

    public Integer getIs_customer() {
        return is_customer;
    }

    public Prospect setIs_customer(Integer is_customer) {
        this.is_customer = is_customer;

        return this;
    }

    public String getName() {
        return name;
    }

    public Prospect setName(String name) {
        this.name = name;

        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Prospect setSurname(String surname) {
        this.surname = surname;

        return this;
    }

    public String getBirthday() {
        return birthday;
    }

    public Prospect setBirthday(String birthday) {
        this.birthday = birthday;

        return this;
    }

    public String getTel() {
        return tel;
    }

    public Prospect setTel(String tel) {
        this.tel = tel;

        return this;
    }

    public String getMail() {
        return mail;
    }

    public Prospect setMail(String mail) {
        this.mail = mail;

        return this;
    }

    public String getLast_contact() {
        return last_contact;
    }

    public Prospect setLast_contact(String last_contact) {
        this.last_contact = last_contact;

        return this;
    }

    public Boolean getCan_be_contacted() {
        return can_be_contacted;
    }

    public Prospect setCan_be_contacted(Boolean can_be_contacted) {
        this.can_be_contacted = can_be_contacted;

        return this;
    }

    public Integer getFamily_situation() {
        return family_situation;
    }

    public Prospect setFamily_situation(Integer family_situation) {
        this.family_situation = family_situation;

        return this;
    }

    public Integer getProfessional_situation() {
        return professional_situation;
    }

    public Prospect setProfessional_situation(Integer professional_situation) {
        this.professional_situation = professional_situation;

        return this;
    }

    public Integer getProfessional_contract_type() {
        return professional_contract_type;
    }

    public Prospect setProfessional_contract_type(Integer professional_contract_type) {
        this.professional_contract_type = professional_contract_type;

        return this;
    }

    public Integer getSalary() {
        return salary;
    }

    public Prospect setSalary(Integer salary) {
        this.salary = salary;

        return this;
    }

    public String getSpendings() {
        return spendings;
    }

    public Prospect setSpendings(String spends) {
        this.spendings = spends;

        return this;
    }

    public String getAdapted_offers() {
        return adapted_offers;
    }

    public Prospect setAdapted_offers(String adapted_offers) {
        this.adapted_offers = adapted_offers;

        return this;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Prospect setCreated_at(String created_at) {
        this.created_at = created_at;

        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Prospect setUpdated_at(String updated_at) {
        this.updated_at = updated_at;

        return this;
    }
    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}
