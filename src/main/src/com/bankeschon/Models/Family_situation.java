package com.bankeschon.Models;

public class Family_situation extends BaseModelORM {
    private String tableName = "family_situations";

    private String label;
    private Integer number;

    public String getLabel() {
        return label;
    }

    public Family_situation setLabel(String label) {
        this.label = label;

        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Family_situation setNumber(Integer number) {
        this.number = number;

        return this;
    }
    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}
