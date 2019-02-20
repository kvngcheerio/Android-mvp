package com.ojaexpress.ojaexpress.di.component;

/**
 * Created by TerryCheerio on 11/1/17.
 */



import com.ojaexpress.ojaexpress.di.PerActivity;
import com.ojaexpress.ojaexpress.di.module.ActivityModule;
import com.ojaexpress.ojaexpress.ui.login.LoginActivity;
import com.ojaexpress.ojaexpress.ui.main.MainActivity;
import com.ojaexpress.ojaexpress.ui.register.RegisterActivity;
import com.ojaexpress.ojaexpress.ui.splash.SplashActivity;


import dagger.Component;



@PerActivity
@Component(dependencies = OjaComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(SplashActivity activity);
    void inject(LoginActivity activity);
    void inject(MainActivity activity);
    void inject(RegisterActivity activity);



}
