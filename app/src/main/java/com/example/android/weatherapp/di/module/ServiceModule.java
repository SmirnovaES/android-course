package com.example.android.weatherapp.di.module;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import com.example.android.weatherapp.data.remote.service.WeatherService;

import javax.inject.Singleton;

@Module public class ServiceModule {

    @Provides @Singleton WeatherService providesWeatherServices(Retrofit retrofit) {
        return retrofit.create(WeatherService.class);
    }
}
