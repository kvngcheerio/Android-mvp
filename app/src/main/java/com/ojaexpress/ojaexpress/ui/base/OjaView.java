package com.ojaexpress.ojaexpress.ui.base;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import android.support.annotation.StringRes;


public interface OjaView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();

}
