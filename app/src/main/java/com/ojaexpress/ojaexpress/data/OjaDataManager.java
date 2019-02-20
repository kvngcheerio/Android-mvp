package com.ojaexpress.ojaexpress.data;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.reflect.TypeToken;
import com.ojaexpress.ojaexpress.data.db.DbHelper;
import com.ojaexpress.ojaexpress.data.db.model.User;
import com.ojaexpress.ojaexpress.data.network.ApiHeader;
import com.ojaexpress.ojaexpress.data.network.ApiHelper;
import com.ojaexpress.ojaexpress.data.network.model.LoginRequest;
import com.ojaexpress.ojaexpress.data.network.model.LoginResponse;
import com.ojaexpress.ojaexpress.data.network.model.LogoutResponse;
import com.ojaexpress.ojaexpress.data.network.model.RegisterRequest;
import com.ojaexpress.ojaexpress.data.network.model.RegisterResponse;
import com.ojaexpress.ojaexpress.data.prefs.PreferencesHelper;

import java.lang.reflect.Type;
import java.util.List;
import com.ojaexpress.ojaexpress.di.OjaContext;
import com.ojaexpress.ojaexpress.utils.CommonUtils;
import com.ojaexpress.ojaexpress.utils.OjaConstants;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

/**
 * Created by TerryCheerio on 11/1/17.
 */

@Singleton
public class OjaDataManager implements DataManager {

    private static final String TAG = "OjaDataManager";

    private final Context mContext;
    private final DbHelper mDbHelper;
    private final PreferencesHelper mPreferencesHelper;
    private final ApiHelper mApiHelper;

    @Inject
    public OjaDataManager(@OjaContext Context context,
                          DbHelper dbHelper,
                          PreferencesHelper preferencesHelper,
                          ApiHelper apiHelper) {
        mContext = context;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
    }

    @Override
    public ApiHeader getApiHeader() {
        return mApiHelper.getApiHeader();
    }

    @Override
    public String getAccessToken() {
        return mPreferencesHelper.getAccessToken();
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPreferencesHelper.setAccessToken(accessToken);
        mApiHelper.getApiHeader().getProtectedApiHeader().setAccessToken(accessToken);
    }

    @Override
    public Observable<Long> insertUser(User user) {
        return mDbHelper.insertUser(user);
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return mDbHelper.getAllUsers();
    }



    @Override
    public Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest
                                                                  request) {
        return mApiHelper.doServerLoginApiCall(request);
    }
    @Override
    public Observable<LogoutResponse> doLogoutApiCall() {
        return mApiHelper.doLogoutApiCall();
    }

    @Override
    public Observable<RegisterResponse> doServerRegisterApiCall(RegisterRequest.ServerRegisterRequest
                                                                  request) {
        return mApiHelper.doServerRegisterApiCall(request);
    }

    @Override
    public int getCurrentUserLoggedInMode() {
        return mPreferencesHelper.getCurrentUserLoggedInMode();
    }

    @Override
    public void setCurrentUserLoggedInMode(LoggedInMode mode) {
        mPreferencesHelper.setCurrentUserLoggedInMode(mode);
    }

    @Override
    public Long getCurrentId() {
        return mPreferencesHelper.getCurrentId();
    }

    @Override
    public void setCurrentId(Long Id) {
        mPreferencesHelper.setCurrentId(Id);
    }

    @Override
    public String getCurrentUserName() {
        return mPreferencesHelper.getCurrentUserName();
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPreferencesHelper.setCurrentUserName(userName);
    }

    @Override
    public String getCurrentFirstName() {
        return mPreferencesHelper.getCurrentFirstName();
    }

    @Override
    public void setCurrentFirstName(String firstName) {
        mPreferencesHelper.setCurrentFirstName(firstName);
    }

    @Override
    public String getCurrentLastName() {
        return mPreferencesHelper.getCurrentLastName();
    }

    @Override
    public void setCurrentLastName(String lastName) {
        mPreferencesHelper.setCurrentLastName(lastName);
    }
    @Override
    public String getCurrentUserEmail() {
        return mPreferencesHelper.getCurrentUserEmail();
    }

    @Override
    public void setCurrentUserEmail(String email) {
        mPreferencesHelper.setCurrentUserEmail(email);
    }

    @Override
    public String getCurrentUserAvatar() {
        return mPreferencesHelper.getCurrentUserAvatar();
    }

    @Override
    public void setCurrentUserAvatar(String userAvatar) {
        mPreferencesHelper.setCurrentUserAvatar(userAvatar);
    }

    @Override
    public void updateApiHeader(Long Id, String accessToken) {
        mApiHelper.getApiHeader().getProtectedApiHeader().setId(Id);
        mApiHelper.getApiHeader().getProtectedApiHeader().setAccessToken(accessToken);
    }

    @Override
    public void updateUserInfo(
            String accessToken,
            Long Id,
            LoggedInMode loggedInMode,
            String userName,
            String lastName,
            String firstName,
            String email,
            String userAvatar) {

        setAccessToken(accessToken);
        setCurrentId(Id);
        setCurrentUserLoggedInMode(loggedInMode);
        setCurrentUserName(userName);
        setCurrentFirstName(firstName);
        setCurrentLastName(lastName);
        setCurrentUserEmail(email);
        setCurrentUserAvatar(userAvatar);

        updateApiHeader(Id, accessToken);
    }

    @Override
    public void setUserAsLoggedOut() {
        updateUserInfo (
                null,
                null,
                DataManager.LoggedInMode.LOGGED_IN_MODE_LOGGED_OUT,
                null,
                null,
                null,
                null,
                null);
    }



}