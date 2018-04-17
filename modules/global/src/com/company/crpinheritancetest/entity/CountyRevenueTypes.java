package com.company.crpinheritancetest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum CountyRevenueTypes implements EnumClass<String> {

    Revenue_Stream("S"),
    Business_Permit("P"),
    County_Revenue("C");

    private String id;

    CountyRevenueTypes(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static CountyRevenueTypes fromId(String id) {
        for (CountyRevenueTypes at : CountyRevenueTypes.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}