package com.example.android.weatherapp.di.module;

import dagger.Module;
import dagger.Provides;
import com.example.android.weatherapp.WeatherApp;

import javax.inject.Singleton;


@Module public class AppModule {

    private WeatherApp application;

    public AppModule(WeatherApp application) {
        this.application = application;
    }

    @Provides @Singleton WeatherApp providesApplication() {
        return this.application;
    }
}
