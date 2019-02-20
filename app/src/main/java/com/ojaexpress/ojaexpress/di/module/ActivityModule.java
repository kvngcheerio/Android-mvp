package com.ojaexpress.ojaexpress.di.module;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;


import com.ojaexpress.ojaexpress.di.ActivityContext;
import com.ojaexpress.ojaexpress.di.PerActivity;
import com.ojaexpress.ojaexpress.ui.login.LoginMvpPresenter;
import com.ojaexpress.ojaexpress.ui.login.LoginMvpView;
import com.ojaexpress.ojaexpress.ui.login.LoginPresenter;
import com.ojaexpress.ojaexpress.ui.main.MainMvpPresenter;
import com.ojaexpress.ojaexpress.ui.main.MainMvpView;
import com.ojaexpress.ojaexpress.ui.main.MainPresenter;
import com.ojaexpress.ojaexpress.ui.register.RegisterMvpPresenter;
import com.ojaexpress.ojaexpress.ui.register.RegisterMvpView;
import com.ojaexpress.ojaexpress.ui.register.RegisterPresenter;
import com.ojaexpress.ojaexpress.ui.splash.SplashMvpPresenter;
import com.ojaexpress.ojaexpress.ui.splash.SplashMvpView;
import com.ojaexpress.ojaexpress.ui.splash.SplashPresenter;
import com.ojaexpress.ojaexpress.utils.rx.OjaSchedulerProvider;
import com.ojaexpress.ojaexpress.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;



@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new OjaSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }
    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RegisterMvpPresenter<RegisterMvpView> provideRegisterPresenter(
            RegisterPresenter<RegisterMvpView> presenter) {
        return presenter;
    }


    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }
}
