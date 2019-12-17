package com.example.android.weatherapp.di.component;

import dagger.Component;
import com.example.android.weatherapp.di.module.AppModule;
import com.example.android.weatherapp.di.module.NetworkModule;
import com.example.android.weatherapp.di.module.RepositoryModule;
import com.example.android.weatherapp.di.module.ServiceModule;
import com.example.android.weatherapp.presentation.view.main.MainActivity;
import com.example.android.weatherapp.presentation.view.settings.SettingsActivity;

import javax.inject.Singleton;


@Singleton @Component(modules = {
    AppModule.class, NetworkModule.class, ServiceModule.class, RepositoryModule.class
}) public interface MainComponent {

    void inject(MainActivity mainActivity);

    void inject(SettingsActivity settingsActivity);
}
