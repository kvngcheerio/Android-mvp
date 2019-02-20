package com.ojaexpress.ojaexpress.utils.rx;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;



public class OjaSchedulerProvider implements SchedulerProvider {

    @Override
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }

    @Override
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @Override
    public Scheduler io() {
        return Schedulers.io();
    }

}