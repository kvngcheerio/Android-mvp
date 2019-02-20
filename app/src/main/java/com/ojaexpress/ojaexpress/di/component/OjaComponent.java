package com.ojaexpress.ojaexpress.di.component;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import android.app.Application;
import android.content.Context;

import com.ojaexpress.ojaexpress.OjaExpressApp;
import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.di.OjaContext;
import com.ojaexpress.ojaexpress.di.module.OjaModule;
import com.ojaexpress.ojaexpress.service.SyncService;

import javax.inject.Singleton;

import dagger.Component;



@Singleton
@Component(modules = OjaModule.class)
public interface OjaComponent {

    void inject(OjaExpressApp app);

    void inject(SyncService service);

    @OjaContext
    Context context();

    Application application();

    DataManager getDataManager();
}