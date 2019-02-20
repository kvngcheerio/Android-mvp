package com.ojaexpress.ojaexpress.ui.base;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import com.androidnetworking.error.ANError;


public interface OjaPresenter<V extends OjaView> {

    void onAttach(V mvpView);

    void onDetach();

    void handleApiError(ANError error);

    void setUserAsLoggedOut();
}
