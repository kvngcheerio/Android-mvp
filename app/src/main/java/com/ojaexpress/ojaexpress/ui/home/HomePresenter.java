package com.ojaexpress.ojaexpress.ui.home;

import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.ui.base.BasePresenter;
import com.ojaexpress.ojaexpress.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by TerryCheerio on 11/4/17.
 */

public class HomePresenter <V extends HomeView> extends BasePresenter<V>
        implements HomeMvpPresenter<V> {

    @Inject
    public HomePresenter(DataManager dataManager,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
