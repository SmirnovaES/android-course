package com.example.android.weatherapp.domain.models;

import com.example.android.weatherapp.domain.models.forecastmodel.ForecastData;
import com.example.android.weatherapp.domain.models.weathermodel.WeatherData;

public class CombinedData {

    private WeatherData mWeatherData;
    private ForecastData mForecastData;

    public CombinedData(WeatherData weatherData, ForecastData forecastData) {
        mWeatherData = weatherData;
        mForecastData = forecastData;
    }

    public ForecastData getForecastData() {
        return mForecastData;
    }

    public WeatherData getWeatherData() {
        return mWeatherData;
    }
}
