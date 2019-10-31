package main.src.com.bankeschon.Models;

import java.util.UUID;

public class Offer_proposed {
    private String tableName = "offers_proposed";

    private UUID id_offer;
    private UUID id_prospect;

    public UUID getId_offer() {
        return id_offer;
    }

    public Offer_proposed setId_offer(UUID id_offer) {
        this.id_offer = id_offer;

        return this;
    }

    public UUID getId_prospect() {
        return id_prospect;
    }

    public Offer_proposed setId_prospect(UUID id_prospect) {
        this.id_prospect = id_prospect;

        return this;
    }
}
