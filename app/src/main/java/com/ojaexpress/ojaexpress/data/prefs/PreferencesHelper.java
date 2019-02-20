package com.ojaexpress.ojaexpress.data.prefs;

import com.ojaexpress.ojaexpress.data.DataManager;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface PreferencesHelper {

    int getCurrentUserLoggedInMode();

    void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode);

    Long getCurrentId();

    void setCurrentId(Long Id);

    String getCurrentUserName();

    void setCurrentUserName(String userName);

    String getCurrentFirstName();

    void setCurrentFirstName(String firstName);

    String getCurrentLastName();

    void setCurrentLastName(String lastName);

    String getCurrentUserEmail();

    void setCurrentUserEmail(String email);

    String getCurrentUserAvatar();

    void setCurrentUserAvatar(String userAvatar);

    String getAccessToken();

    void setAccessToken(String accessToken);

}
