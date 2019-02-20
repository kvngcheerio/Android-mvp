package com.ojaexpress.ojaexpress.ui.register;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ojaexpress.ojaexpress.R;
import com.ojaexpress.ojaexpress.ui.base.BaseActivity;
import com.ojaexpress.ojaexpress.ui.login.LoginActivity;


import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity implements RegisterMvpView {

    @Inject
    RegisterMvpPresenter<RegisterMvpView> mPresenter;

    @BindView(R.id.firstname)
    EditText mFirstNameEditText;

    @BindView(R.id.lastname)
    EditText mLastNameEditText;

    @BindView(R.id.email)
    EditText mEmailEditText;

    @BindView(R.id.password)
    EditText mPasswordEditText;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(RegisterActivity.this);
    }

    @OnClick(R.id.btnRegister)
    void onServerRegisterClick(View v) {
        mPresenter.onServerRegisterClick(mFirstNameEditText.getText().toString(), mLastNameEditText.getText().toString(), mEmailEditText.getText().toString(),
                mPasswordEditText.getText().toString());
    }


    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(RegisterActivity.this);
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