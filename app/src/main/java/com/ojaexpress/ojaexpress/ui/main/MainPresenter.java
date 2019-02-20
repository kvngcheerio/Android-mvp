package com.ojaexpress.ojaexpress.ui.main;

import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.ui.base.BasePresenter;
import com.ojaexpress.ojaexpress.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V>
        implements MainMvpPresenter<V> {

    private static final String TAG = "MainPresenter";

    @Inject
    public MainPresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

}
