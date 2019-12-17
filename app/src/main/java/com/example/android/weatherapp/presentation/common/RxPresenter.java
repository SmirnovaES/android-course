package com.example.android.weatherapp.presentation.common;

import io.reactivex.ObservableTransformer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import com.example.android.weatherapp.domain.schedulers.BaseSchedulerProvider;

public abstract class RxPresenter<V> {

    protected final V view;
    private CompositeDisposable disposables;

    protected RxPresenter(V view) {
        this.view = view;
        disposables = new CompositeDisposable();
    }

    protected void addDisposable(Disposable disposable) {
        disposables.add(disposable);
    }

    protected void dispose() {
        disposables.clear();
    }

    protected <T> ObservableTransformer<T, T> applySchedulers(BaseSchedulerProvider schedulerProvider) {
        return observable -> observable.subscribeOn(schedulerProvider.io())
            .observeOn(schedulerProvider.mainThread());
    }
}
