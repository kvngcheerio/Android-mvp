package com.ojaexpress.ojaexpress.data.db;

/**
 * Created by TerryCheerio on 11/1/17.
 */
import android.content.Context;


import com.ojaexpress.ojaexpress.di.DatabaseInfo;
import com.ojaexpress.ojaexpress.di.OjaContext;
import com.ojaexpress.ojaexpress.utils.OjaLogger;
import com.ojaexpress.ojaexpress.data.db.model.DaoMaster;
import org.greenrobot.greendao.database.Database;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper {

    @Inject
    public DbOpenHelper(@OjaContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        OjaLogger.d("DEBUG", "DB_OLD_VERSION : " + oldVersion + ", DB_NEW_VERSION : " + newVersion);
        switch (oldVersion) {
            case 1:
            case 2:
                //db.execSQL("ALTER TABLE " + UserDao.TABLENAME + " ADD COLUMN "
                // + UserDao.Properties.Name.columnName + " TEXT DEFAULT 'DEFAULT_VAL'");
        }
    }
}