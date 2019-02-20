package com.ojaexpress.ojaexpress.data.prefs;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.di.OjaContext;
import com.ojaexpress.ojaexpress.di.PreferenceInfo;
import com.ojaexpress.ojaexpress.utils.OjaConstants;

import javax.inject.Inject;
import javax.inject.Singleton;



@Singleton
public class OjaPreferencesHelper implements PreferencesHelper {

    private static final String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE";
    private static final String PREF_KEY_CURRENT_ID = "PREF_KEY_CURRENT_ID";
    private static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
    private static final String PREF_KEY_CURRENT_FIRST_NAME = "PREF_KEY_CURRENT_FIRST_NAME";
    private static final String PREF_KEY_CURRENT_LAST_NAME = "PREF_KEY_CURRENT_LAST_NAME";
    private static final String PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL";
    private static final String PREF_KEY_CURRENT_USER_AVATAR
            = "PREF_KEY_CURRENT_USER_AVATAR";
    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";

    private final SharedPreferences mPrefs;

    @Inject
    public OjaPreferencesHelper(@OjaContext  Context context,
                                @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public Long getCurrentId() {
        long Id = mPrefs.getLong(PREF_KEY_CURRENT_ID, OjaConstants.NULL_INDEX);
        return Id == OjaConstants.NULL_INDEX ? null : Id;
    }

    @Override
    public void setCurrentId(Long Id) {
        long id = Id == null ? OjaConstants.NULL_INDEX : Id;
        mPrefs.edit().putLong(PREF_KEY_CURRENT_ID, id).apply();
    }

    @Override
    public String getCurrentUserName() {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, null);
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply();
    }

    @Override
    public String getCurrentFirstName() {
        return mPrefs.getString(PREF_KEY_CURRENT_FIRST_NAME, null);
    }

    @Override
    public void setCurrentFirstName(String firstName) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_FIRST_NAME, firstName).apply();
    }
    @Override
    public String getCurrentLastName() {
        return mPrefs.getString(PREF_KEY_CURRENT_LAST_NAME, null);
    }

    @Override
    public void setCurrentLastName(String lastName) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_LAST_NAME, lastName).apply();
    }

    @Override
    public String getCurrentUserEmail() {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_EMAIL, null);
    }

    @Override
    public void setCurrentUserEmail(String email) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_EMAIL, email).apply();
    }

    @Override
    public String getCurrentUserAvatar() {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_AVATAR, null);
    }

    @Override
    public void setCurrentUserAvatar(String userAvatar) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_AVATAR, userAvatar).apply();
    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return mPrefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE,
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT.getType());
    }

    @Override
    public void setCurrentUserLoggedInMode(DataManager.LoggedInMode mode) {
        mPrefs.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.getType()).apply();
    }

    @Override
    public String getAccessToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, null);
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply();
    }
}
