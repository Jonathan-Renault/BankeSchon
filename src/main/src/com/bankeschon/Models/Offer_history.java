package com.bankeschon.Models;

public class Offer_history extends BaseModelORM {
    private String tableName = "history";

    private Integer id_offer;
    private Integer id_prospect;
    private Boolean accepted;
    private String created_at;
    private String updated_at;

    public Integer getId_offer() {
        return id_offer;
    }

    public Offer_history setId_offer(Integer id_offer) {
        this.id_offer = id_offer;

        return this;
    }

    public Integer getId_prospect() {
        return id_prospect;
    }

    public Offer_history setId_prospect(Integer id_prospect) {
        this.id_prospect = id_prospect;

        return this;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public Offer_history setAccepted(Boolean accepted) {
        this.accepted = accepted;

        return this;
    }

    public String getCreated_at() {
        return created_at;
    }

    public Offer_history setCreated_at(String created_at) {
        this.created_at = created_at;

        return this;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public Offer_history setUpdated_at(String updated_at) {
        this.updated_at = updated_at;

        return this;
    }
    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}
