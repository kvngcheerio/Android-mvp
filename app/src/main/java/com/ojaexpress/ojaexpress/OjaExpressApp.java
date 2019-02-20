package com.ojaexpress.ojaexpress;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.app.Application;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.interceptors.HttpLoggingInterceptor.Level;
import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.di.component.OjaComponent;
import com.ojaexpress.ojaexpress.di.module.OjaModule;
import com.ojaexpress.ojaexpress.utils.OjaLogger;
import javax.inject.Inject;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class OjaExpressApp extends Application {

    @Inject
    DataManager mDataManager;

    @Inject
    CalligraphyConfig mCalligraphyConfig;

    private OjaComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new OjaModule(this)).build();

        mApplicationComponent.inject(this);

        OjaLogger.init();

        AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(Level.BODY);
        }

        CalligraphyConfig.initDefault(mCalligraphyConfig);
    }

    public OjaComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(OjaComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
