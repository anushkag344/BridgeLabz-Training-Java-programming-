package com.library.school.config;

public class DistrictPolicy {

    private static DistrictPolicy instance;
    private String districtName = "Valley School District";

    private DistrictPolicy() {
    }

    public static DistrictPolicy getInstance() {
        if (instance == null) {
            instance = new DistrictPolicy();
        }
        return instance;
    }

    public String getDistrictName() {
        return districtName;
    }
}