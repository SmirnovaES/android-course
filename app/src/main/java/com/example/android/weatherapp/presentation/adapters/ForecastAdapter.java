package com.example.android.weatherapp.presentation.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.android.weatherapp.R;
import com.example.android.weatherapp.domain.models.forecastmodel.ForecastData;
import com.example.android.weatherapp.domain.models.forecastmodel.List;
import com.example.android.weatherapp.utils.PrefsManager;
import com.example.android.weatherapp.utils.WeatherUtil;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ViewHolder> {

    private Context mContext;
    private ForecastData mForecastData = new ForecastData();
    private PrefsManager prefs;

    public ForecastAdapter(Context context) {
        mContext = context;
        prefs = PrefsManager.from(mContext);
    }

    @Override
    public int getItemCount() {
        return mForecastData.getList().size();
    }

    @Override
    public ForecastAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.row_forecast, parent, false));
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ViewHolder holder, int position) {
        if(mForecastData.getList() != null){
            List forecastItem = mForecastData.getList().get(position);
            holder.tvIcon.setText(WeatherUtil.getWeatherIcon(forecastItem.getWeather().get(0).getId()));
            holder.tvWeekday.setText(WeatherUtil.getWeekDay(forecastItem.getDt()));
            holder.tvDate.setText(WeatherUtil.getDate(forecastItem.getDt()));
            holder.tvCondition.setText(forecastItem.getWeather().get(0).getDescription());
            holder.tvTempMin.setText(WeatherUtil.getTempString(forecastItem.getTemp().getMin(), prefs.isUnitMetric()));
            holder.tvTempMax.setText(WeatherUtil.getTempString(forecastItem.getTemp().getMax(), prefs.isUnitMetric()));
        }
    }

    public void setForecastData(ForecastData forecastData) {
        mForecastData = forecastData;
        notifyDataSetChanged();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvIcon;
        private TextView tvWeekday;
        private TextView tvDate;
        private TextView tvCondition;
        private TextView tvTempMin;
        private TextView tvTempMax;

        public ViewHolder(View v) {
            super(v);
            tvIcon = (TextView) v.findViewById(R.id.tv_icon);
            tvWeekday = (TextView) v.findViewById(R.id.tv_weekday);
            tvDate = (TextView) v.findViewById(R.id.tv_date);
            tvCondition = (TextView) v.findViewById(R.id.tv_condition);
            tvTempMin = (TextView) v.findViewById(R.id.tv_temp_min);
            tvTempMax = (TextView) v.findViewById(R.id.tv_temp_max);
        }
    }
}
