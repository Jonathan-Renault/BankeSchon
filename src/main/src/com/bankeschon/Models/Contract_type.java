package com.bankeschon.Models;

import org.omg.PortableInterceptor.INACTIVE;

public class Contract_type extends BaseModelORM {
    private Integer id;
    private String tableName = "contract_types";

    private String label;
    private Integer number;

    public Integer getId() {
        return id;
    }

    public Contract_type setId(Integer id) {
        this.id = id;

        return this;
    }

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
    @Override
    public String getTableName()
    {
        return this.tableName;
    }
}
