package com.ojaexpress.ojaexpress.ui.base;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface SubOjaView extends OjaView {

    void onCreate();

    void onStart();

    void onResume();

    void onPause();

    void onStop();

    void onDestroy();

    void attachParentMvpView(OjaView ojaView);
}
