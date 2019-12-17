package com.example.android.weatherapp.domain.models.forecastmodel;

import java.util.ArrayList;

public class ForecastData {

    private City city;
    private String cod;
    private Double message;
    private Integer cnt;
    private java.util.List<List> list = new ArrayList<>();

    public City getCity() {
        return city;
    }

    public Integer getCnt() {
        return cnt;
    }

    public String getCod() {
        return cod;
    }

    public java.util.List<List> getList() {
        return list;
    }

    public Double getMessage() {
        return message;
    }
}
