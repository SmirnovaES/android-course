package com.example.android.weatherapp.data.remote.repository;

import io.reactivex.Observable;
import com.example.android.weatherapp.domain.models.forecastmodel.ForecastData;
import com.example.android.weatherapp.domain.models.weathermodel.WeatherData;

public interface WeatherRepository {

    Observable<WeatherData> getWeatherByCity(String cityName, String units);

    Observable<ForecastData> getForecastByCity(String cityName, String units);

    Observable<WeatherData> getWeatherByLocation(String lat, String lon, String units);

    Observable<ForecastData> getForecastByLocation(String lat, String lon, String units);
}
