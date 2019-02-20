package com.ojaexpress.ojaexpress.ui.login;

import com.ojaexpress.ojaexpress.di.PerActivity;
import com.ojaexpress.ojaexpress.ui.base.OjaPresenter;

/**
 * Created by TerryCheerio on 11/1/17.
 */

@PerActivity
public interface LoginMvpPresenter<V extends LoginMvpView> extends OjaPresenter<V> {

    void onServerLoginClick(String username, String password);



}
