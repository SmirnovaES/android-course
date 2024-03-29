package com.example.android.weatherapp.data.remote.service;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.android.weatherapp.domain.models.forecastmodel.ForecastData;
import com.example.android.weatherapp.domain.models.weathermodel.WeatherData;
import com.example.android.weatherapp.utils.Constants;

public interface WeatherService {

    @GET(Constants.API_WEATHER + Constants.API_APP_ID) Observable<WeatherData> getWeatherByCity(
            @Query("q") String cityName, @Query("units") String units);

    @GET(Constants.API_FORECAST + Constants.API_APP_ID) Observable<ForecastData> getForecastByCity(
            @Query("q") String cityName, @Query("units") String units);

    @GET(Constants.API_WEATHER + Constants.API_APP_ID) Observable<WeatherData> getWeatherByLocation(
            @Query("lat") String lat, @Query("lon") String lon, @Query("units") String units);

    @GET(Constants.API_FORECAST + Constants.API_APP_ID) Observable<ForecastData> getForecastByLocation(
            @Query("lat") String lat, @Query("lon") String lon, @Query("units") String units);
}
