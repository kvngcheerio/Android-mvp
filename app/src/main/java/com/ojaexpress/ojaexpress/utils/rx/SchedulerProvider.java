package com.ojaexpress.ojaexpress.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface SchedulerProvider {

    Scheduler ui();

    Scheduler computation();

    Scheduler io();

}

