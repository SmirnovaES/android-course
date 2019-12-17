package com.example.android.weatherapp.di.module;

import dagger.Module;
import dagger.Provides;
import com.example.android.weatherapp.data.remote.repository.WeatherRepository;
import com.example.android.weatherapp.data.remote.repository.WeatherRepositoryImpl;
import com.example.android.weatherapp.data.remote.service.WeatherService;

import javax.inject.Singleton;

@Module public class RepositoryModule {

    @Provides @Singleton WeatherRepository providesWeatherRepository(WeatherService service) {
        return new WeatherRepositoryImpl(service);
    }
}
