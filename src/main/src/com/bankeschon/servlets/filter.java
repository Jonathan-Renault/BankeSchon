package com.bankeschon.servlets;

import java.util.HashMap;

public class filter {
    public static HashMap add(String operator, String col, String value) {
        HashMap _filter1 = new HashMap();

        _filter1.put("operator", operator);
        _filter1.put("col", col);
        _filter1.put("value", value);

        return _filter1;
    }
}