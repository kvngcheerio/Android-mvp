package com.ojaexpress.ojaexpress.ui.register;

import com.ojaexpress.ojaexpress.ui.base.OjaPresenter;


/**
 * Created by TerryCheerio on 11/4/17.
 */

public interface RegisterMvpPresenter<V extends RegisterMvpView> extends OjaPresenter<V> {

    void onServerRegisterClick(String firstname, String lastname, String email,  String password);



}

