package com.bankeschon.Models;

import org.jetbrains.annotations.NotNull;

public class Offer_score implements Comparable<Offer_score> {
    private Integer score;
    private String name_offer;
    private Integer id_offer;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName_offer() {
        return name_offer;
    }

    public void setName_offer(String name_offer) {
        this.name_offer = name_offer;
    }

    public Integer getId_offer() {
        return id_offer;
    }

    public void setId_offer(Integer id_offer) {
        this.id_offer = id_offer;
    }

    @Override
    public int compareTo(Offer_score o) {
        return this.score - o.score;
    }
}
