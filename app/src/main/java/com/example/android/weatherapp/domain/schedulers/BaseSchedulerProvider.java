package com.example.android.weatherapp.domain.schedulers;

import android.support.annotation.NonNull;
import io.reactivex.Scheduler;

public interface BaseSchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler mainThread();

    @NonNull
    Scheduler newThread();
}
