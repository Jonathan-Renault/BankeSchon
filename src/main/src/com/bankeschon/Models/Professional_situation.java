package main.src.com.bankeschon.Models;

public class Professional_situation {
    private String tableName = "professional_situations";

    private String label;
    private Integer number;

    public String getLabel() {
        return label;
    }

    public Professional_situation setLabel(String label) {
        this.label = label;

        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Professional_situation setNumber(Integer number) {
        this.number = number;

        return this;
    }
}
