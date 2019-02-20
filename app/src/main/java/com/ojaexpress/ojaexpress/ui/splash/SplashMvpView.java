package com.ojaexpress.ojaexpress.ui.splash;

import com.ojaexpress.ojaexpress.ui.base.OjaView;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface SplashMvpView extends OjaView {

    void openLoginActivity();

    void openMainActivity();

    void startSyncService();
}
