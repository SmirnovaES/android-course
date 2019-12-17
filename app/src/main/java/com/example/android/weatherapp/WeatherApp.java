package com.example.android.weatherapp;

import android.app.Application;
import android.content.Context;
import com.example.android.weatherapp.di.component.DaggerMainComponent;
import com.example.android.weatherapp.di.component.MainComponent;
import com.example.android.weatherapp.di.module.AppModule;

public class WeatherApp extends Application {

    private static Context mContext;
    private MainComponent mainComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initDagger();
        mContext = this;
    }

    private void initDagger() {
        mainComponent = DaggerMainComponent.builder().appModule(new AppModule(this)).build();
    }

    public MainComponent getMainComponent(){
        return mainComponent;
    }

    public static Context getContext() {
        return mContext;
    }
}
