package com.bankeschon.Models;

public class Professional_situation extends BaseModelORM {
    private String tableName = "professional_situations";

    private Integer id;
    private String label;
    private Integer number;

    public Integer getId() {
        return id;
    }

    public Professional_situation setId(Integer id) {
        this.id = id;

        return this;
    }

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
    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}
