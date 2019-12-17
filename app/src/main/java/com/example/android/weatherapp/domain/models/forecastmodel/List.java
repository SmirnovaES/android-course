package com.example.android.weatherapp.domain.models.forecastmodel;

import com.example.android.weatherapp.domain.models.Weather;

import java.util.ArrayList;

public class List {

    private Integer dt;
    private Temp temp;
    private Double pressure;
    private Integer humidity;
    private java.util.List<Weather> weather = new ArrayList<Weather>();
    private Double speed;
    private Integer deg;
    private Integer clouds;
    private Double rain;

    public Integer getClouds() {
        return clouds;
    }

    public Integer getDeg() {
        return deg;
    }

    public Integer getDt() {
        return dt;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Double getPressure() {
        return pressure;
    }

    public Double getRain() {
        return rain;
    }

    public Double getSpeed() {
        return speed;
    }

    public Temp getTemp() {
        return temp;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }
}
