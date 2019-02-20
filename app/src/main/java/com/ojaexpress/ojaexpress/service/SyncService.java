package com.ojaexpress.ojaexpress.service;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;


import com.ojaexpress.ojaexpress.OjaExpressApp;
import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.di.component.DaggerServiceComponent;
import com.ojaexpress.ojaexpress.di.component.ServiceComponent;
import com.ojaexpress.ojaexpress.utils.OjaLogger;

import javax.inject.Inject;



public class SyncService extends Service {

    private static final String TAG = "SyncService";

    @Inject
    DataManager mDataManager;

    public static Intent getStartIntent(Context context) {
        return new Intent(context, SyncService.class);
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, SyncService.class);
        context.startService(starter);
    }

    public static void stop(Context context) {
        context.stopService(new Intent(context, SyncService.class));
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ServiceComponent component = DaggerServiceComponent.builder()
                .ojaComponent(((OjaExpressApp) getApplication()).getComponent())
                .build();
        component.inject(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        OjaLogger.d(TAG, "SyncService started");
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        OjaLogger.d(TAG, "SyncService stopped");
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
