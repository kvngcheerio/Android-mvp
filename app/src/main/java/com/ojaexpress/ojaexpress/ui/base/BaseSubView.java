package com.ojaexpress.ojaexpress.ui.base;

/**
 * Created by TerryCheerio on 11/1/17.
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.view.ViewGroup;



public abstract class BaseSubView extends ViewGroup implements SubOjaView {

    private OjaView mParentOjaView;

    public BaseSubView(Context context) {
        super(context);
    }

    public BaseSubView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseSubView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(21)
    public BaseSubView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void attachParentMvpView(OjaView ojaView) {
        mParentOjaView = ojaView;
    }

    @Override
    public void showLoading() {
        if (mParentOjaView != null) {
            mParentOjaView.showLoading();
        }
    }

    @Override
    public void hideLoading() {
        if (mParentOjaView != null) {
            mParentOjaView.hideLoading();
        }
    }

    @Override
    public void onError(@StringRes int resId) {
        if (mParentOjaView != null) {
            mParentOjaView.onError(resId);
        }
    }

    @Override
    public void onError(String message) {
        if (mParentOjaView != null) {
            mParentOjaView.onError(message);
        }
    }

    @Override
    public void showMessage(String message) {
        if (mParentOjaView != null) {
            mParentOjaView.showMessage(message);
        }
    }

    @Override
    public void showMessage(@StringRes int resId) {
        if (mParentOjaView != null) {
            mParentOjaView.showMessage(resId);
        }
    }

    @Override
    public void hideKeyboard() {
        if (mParentOjaView != null) {
            mParentOjaView.hideKeyboard();
        }
    }

    @Override
    public boolean isNetworkConnected() {
        if (mParentOjaView != null) {
            return mParentOjaView.isNetworkConnected();
        }
        return false;
    }

    @Override
    public void openActivityOnTokenExpire() {
        if (mParentOjaView != null) {
            mParentOjaView.openActivityOnTokenExpire();
        }
    }

    protected abstract void bindViewsAndSetOnClickListeners();

    protected abstract void setUp();
}
