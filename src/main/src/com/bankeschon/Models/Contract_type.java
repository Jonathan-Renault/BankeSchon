package main.src.com.bankeschon.Models;

public class Contract_type {
    private String tableName = "contract_types";

    private String label;
    private Integer number;

    public String getLabel() {
        return label;
    }

    public Contract_type setLabel(String label) {
        this.label = label;

        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Contract_type setNumber(Integer number) {
        this.number = number;

        return this;
    }
}
