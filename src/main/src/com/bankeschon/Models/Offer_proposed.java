package com.bankeschon.Models;

public class Offer_proposed extends BaseModelORM {
    private String tableName = "offers_proposed";

    private Integer id_offer;
    private Integer id_prospect;

    public Integer getId_offer() {
        return id_offer;
    }

    public Offer_proposed setId_offer(Integer id_offer) {
        this.id_offer = id_offer;

        return this;
    }

    public Integer getId_prospect() {
        return id_prospect;
    }

    public Offer_proposed setId_prospect(Integer id_prospect) {
        this.id_prospect = id_prospect;

        return this;
    }
    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}
