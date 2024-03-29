package com.example.android.weatherapp.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class PrefsManager {

    private final static String TAG = PrefsManager.class.getSimpleName();
    private SharedPreferences prefs;

    private PrefsManager(Context context) {
        prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static PrefsManager from(Context context) {
        return new PrefsManager(context);
    }

    public void registerChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        prefs.registerOnSharedPreferenceChangeListener(listener);
    }

    public void unregisterChangeListener(SharedPreferences.OnSharedPreferenceChangeListener listener){
        prefs.unregisterOnSharedPreferenceChangeListener(listener);
    }

    public void setLocationToggle(boolean locationToggle){
        prefs.edit().putBoolean(Constants.PREF_LOCATION_TOGGLE, locationToggle).apply();
    }

    public boolean getLocationToggle() {
        return prefs.getBoolean(Constants.PREF_LOCATION_TOGGLE, true);
    }

    public String getCity() {
        return prefs.getString(Constants.PREF_CITY, Constants.PREF_CITY_DEFAULT);
    }

    public void setCity(String city) {
        prefs.edit().putString(Constants.PREF_CITY, city).apply();
    }

    public boolean isUnitMetric(){
        return getUnit().equalsIgnoreCase(Constants.PREF_UNIT_METRIC);
    }
    public String getUnit() {
        return prefs.getString(Constants.PREF_UNIT, Constants.PREF_UNIT_METRIC);
    }

    public void setUnit(String unit) {
        prefs.edit().putString(Constants.PREF_UNIT, unit).apply();
    }

    public String getSelectedCity(){
        return getCity();
    }

    public String getWindSpeedUnit(){
        return isUnitMetric() ? Constants.DETAIL_LABEL_WIND_METRIC :
                Constants.DETAIL_LABEL_WIND_IMP;
    }

    public String getTempUnit(){
        return isUnitMetric() ? Constants.API_METRIC : Constants.API_IMPERIAL;
    }
}
