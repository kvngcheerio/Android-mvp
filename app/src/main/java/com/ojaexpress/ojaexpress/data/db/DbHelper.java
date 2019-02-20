package com.ojaexpress.ojaexpress.data.db;

/**
 * Created by TerryCheerio on 11/1/17.
 */


import com.ojaexpress.ojaexpress.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;



public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();


}
