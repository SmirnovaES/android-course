package com.example.android.weatherapp.domain.models.forecastmodel;

import com.example.android.weatherapp.domain.models.Coord;

public class City {

    private Integer id;
    private String name;
    private Coord coord;
    private String country;
    private Integer population;

    public Coord getCoord() {
        return coord;
    }

    public String getCountry() {
        return country;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }
}
