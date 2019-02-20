package com.ojaexpress.ojaexpress.di.component;

/**
 * Created by TerryCheerio on 11/1/17.
 */


import com.ojaexpress.ojaexpress.di.PerService;
import com.ojaexpress.ojaexpress.di.module.ServiceModule;
import com.ojaexpress.ojaexpress.service.SyncService;

import dagger.Component;



@PerService
@Component(dependencies = OjaComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {

    void inject(SyncService service);

}
