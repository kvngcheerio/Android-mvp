package com.ojaexpress.ojaexpress.data.db;


import com.ojaexpress.ojaexpress.data.db.model.DaoMaster;
import com.ojaexpress.ojaexpress.data.db.model.DaoSession;
import com.ojaexpress.ojaexpress.data.db.model.User;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by TerryCheerio on 11/1/17.
 */

@Singleton
public class OjaDbHelper implements DbHelper {

    private final DaoSession mDaoSession;

    @Inject
    public OjaDbHelper(DbOpenHelper dbOpenHelper) {
        mDaoSession = new DaoMaster(dbOpenHelper.getWritableDb()).newSession();
    }

    @Override
    public Observable<Long> insertUser(final User user) {
        return Observable.fromCallable(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return mDaoSession.getUserDao().insert(user);
            }
        });
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return Observable.fromCallable(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return mDaoSession.getUserDao().loadAll();
            }
        });
    }


}
