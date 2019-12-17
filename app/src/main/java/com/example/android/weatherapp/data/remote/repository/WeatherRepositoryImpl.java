package com.example.android.weatherapp.data.remote.repository;

import com.example.android.weatherapp.data.remote.service.WeatherService;
import io.reactivex.Observable;
import com.example.android.weatherapp.domain.models.forecastmodel.ForecastData;
import com.example.android.weatherapp.domain.models.weathermodel.WeatherData;


public class WeatherRepositoryImpl implements WeatherRepository {

    private final WeatherService weatherService;

    public WeatherRepositoryImpl(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @Override
    public Observable<WeatherData> getWeatherByCity(String cityName, String units) {
        return weatherService.getWeatherByCity(cityName, units);
    }

    @Override
    public Observable<ForecastData> getForecastByCity(String cityName, String units) {
        return weatherService.getForecastByCity(cityName, units);
    }

    @Override
    public Observable<WeatherData> getWeatherByLocation(String lat, String lon, String units) {
        return weatherService.getWeatherByLocation(lat, lon, units);
    }

    @Override
    public Observable<ForecastData> getForecastByLocation(String lat, String lon, String units) {
        return weatherService.getForecastByLocation(lat, lon, units);
    }
}
