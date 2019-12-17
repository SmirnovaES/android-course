package com.example.android.weatherapp.domain.models.forecastmodel;

public class Temp {
    private Double day;
    private Double min;
    private Double max;
    private Double night;
    private Double eve;
    private Double morn;

    public Double getDay() {
        return day;
    }

    public Double getEve() {
        return eve;
    }

    public Double getMax() {
        return max;
    }

    public Double getMin() {
        return min;
    }

    public Double getMorn() {
        return morn;
    }

    public Double getNight() {
        return night;
    }
}
