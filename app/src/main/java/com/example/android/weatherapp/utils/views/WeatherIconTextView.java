package com.example.android.weatherapp.utils.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.example.android.weatherapp.utils.WeatherFontHelper;

public class WeatherIconTextView extends TextView {

    public WeatherIconTextView(Context context){
        super(context, null);
        WeatherFontHelper.setWeatherTypeface(context, this);
    }

    public WeatherIconTextView(Context context, AttributeSet attrs){
        super(context, attrs);
        WeatherFontHelper.setWeatherTypeface(context, this);
    }

    public WeatherIconTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
       WeatherFontHelper.setWeatherTypeface(context, this);
    }

    protected void onDraw (Canvas canvas) {
        super.onDraw(canvas);
    }
}