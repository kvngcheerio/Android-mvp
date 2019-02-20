package com.ojaexpress.ojaexpress.data;

import com.ojaexpress.ojaexpress.data.db.DbHelper;
import com.ojaexpress.ojaexpress.data.network.ApiHelper;
import com.ojaexpress.ojaexpress.data.prefs.PreferencesHelper;

import io.reactivex.Observable;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface DataManager extends DbHelper, PreferencesHelper, ApiHelper {

    void updateApiHeader(Long Id, String accessToken);

    void setUserAsLoggedOut();

    void updateUserInfo(
            String accessToken,
            Long Id,
            LoggedInMode loggedInMode,
            String userName,
            String firstName,
            String lastName,
            String email,
            String userAvatar);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_SERVER(1);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
