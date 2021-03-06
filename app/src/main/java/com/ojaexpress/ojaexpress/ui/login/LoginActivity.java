package com.ojaexpress.ojaexpress.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import com.ojaexpress.ojaexpress.R;
import com.ojaexpress.ojaexpress.ui.base.BaseActivity;
import com.ojaexpress.ojaexpress.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;




public class LoginActivity extends BaseActivity implements LoginMvpView {

    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;

    @BindView(R.id.email)
    EditText mEmailEditText;

    @BindView(R.id.password)
    EditText mPasswordEditText;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(LoginActivity.this);
    }

    @OnClick(R.id.btnLogin)
    void onServerLoginClick(View v) {
        mPresenter.onServerLoginClick(mEmailEditText.getText().toString(),
                mPasswordEditText.getText().toString());
    }


    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(LoginActivity.this);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }
}