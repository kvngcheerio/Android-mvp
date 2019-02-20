package com.ojaexpress.ojaexpress.di.module;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.app.Service;

import dagger.Module;



@Module
public class ServiceModule {

    private final Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }
}
