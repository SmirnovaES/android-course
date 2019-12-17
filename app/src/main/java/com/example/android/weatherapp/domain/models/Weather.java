package com.example.android.weatherapp.domain.models;

public class Weather {
    private Integer id;
    private String main;
    private String description;
    private String icon;

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public Integer getId() {
        return id;
    }

    public String getMain() {
        return main;
    }
}
