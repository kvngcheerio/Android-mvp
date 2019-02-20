package com.ojaexpress.ojaexpress.ui.main;

import com.ojaexpress.ojaexpress.ui.base.OjaView;

import java.util.List;

/**
 * Created by TerryCheerio on 11/1/17.
 */

public interface MainMvpView extends OjaView {

    void openLoginActivity();



    void updateFirstName(String currentFirstName);

    void updateLastName(String currentLastName);

    void updateUserEmail(String currentUserEmail);

    void updateUserAvatar(String currentUserAvatar);

}
