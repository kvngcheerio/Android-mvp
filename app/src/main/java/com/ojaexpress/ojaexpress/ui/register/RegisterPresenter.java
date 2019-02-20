package com.ojaexpress.ojaexpress.ui.register;

import com.ojaexpress.ojaexpress.R;
import com.ojaexpress.ojaexpress.data.DataManager;
import com.ojaexpress.ojaexpress.data.network.model.RegisterRequest;
import com.ojaexpress.ojaexpress.ui.base.BasePresenter;
import com.ojaexpress.ojaexpress.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by TerryCheerio on 11/4/17.
 */

public class RegisterPresenter <V extends RegisterMvpView> extends BasePresenter<V>
        implements RegisterMvpPresenter<V> {

    private static final String TAG = "LoginPresenter";

    @Inject
    public RegisterPresenter(DataManager dataManager,
                             SchedulerProvider schedulerProvider,
                             CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onServerRegisterClick(String firstname, String lastname, String email, String password) {
        //validate input
        if (firstname == null || firstname.isEmpty()) {
            getMvpView().onError(R.string.empty_firstname);
            return;
        }
        if (lastname == null || lastname.isEmpty()) {
            getMvpView().onError(R.string.empty_lastname);
            return;
        }
        if (email == null || email.isEmpty()) {
            getMvpView().onError(R.string.empty_username);
            return;
        }
        if (password == null || password.isEmpty()) {
            getMvpView().onError(R.string.empty_password);
            return;
        }
        getMvpView().showLoading();

        if (!isViewAttached()) {
            return;
        }
        getMvpView().hideLoading();
        getMvpView().openLoginActivity();

    }
}