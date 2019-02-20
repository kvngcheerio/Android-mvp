package com.ojaexpress.ojaexpress.di.module;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.app.Application;
import android.content.Context;

import com.ojaexpress.ojaexpress.R;
import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.data.OjaDataManager;
import com.ojaexpress.ojaexpress.data.db.DbHelper;
import com.ojaexpress.ojaexpress.data.db.OjaDbHelper;
import com.ojaexpress.ojaexpress.data.network.ApiHeader;
import com.ojaexpress.ojaexpress.data.network.ApiHelper;
import com.ojaexpress.ojaexpress.data.network.OjaApiHelper;
import com.ojaexpress.ojaexpress.data.prefs.OjaPreferencesHelper;
import com.ojaexpress.ojaexpress.data.prefs.PreferencesHelper;
import com.ojaexpress.ojaexpress.di.DatabaseInfo;
import com.ojaexpress.ojaexpress.di.OjaContext;
import com.ojaexpress.ojaexpress.di.PreferenceInfo;
import com.ojaexpress.ojaexpress.utils.OjaConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;



@Module
public class OjaModule {

    private final Application mApplication;

    public OjaModule(Application application) {
        mApplication = application;
    }

    @Provides
    @OjaContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return OjaConstants.DB_NAME;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return OjaConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(OjaDataManager ojaDataManager) {
        return ojaDataManager;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(OjaDbHelper ojaDbHelper) {
        return ojaDbHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(OjaPreferencesHelper ojaPreferencesHelper) {
        return ojaPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(OjaApiHelper ojaApiHelper) {
        return ojaApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                preferencesHelper.getCurrentId(),
                preferencesHelper.getAccessToken());
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }
}