package com.bankeschon.Models;

import java.lang.Float;

public class Howmanyprospect extends BaseModelORM {
    private String tableName = "howmanyprospect";

    private Float count;

    @Override
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }
}