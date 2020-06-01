package com.example.shixun2.presenter;

import android.text.TextUtils;

import com.example.shixun2.base.BaseCallback;
import com.example.shixun2.base.BasePresenter;
import com.example.shixun2.bean.LoginBean;
import com.example.shixun2.model.LoginModel;
import com.example.shixun2.view.LoginView;


public class LoginPresenter extends BasePresenter<LoginModel, LoginView> implements BaseCallback<LoginBean, String> {

    public void login(String name, String pwd) {
        if (TextUtils.isEmpty(name)) {
            if (view != null) {
                view.onFail("name不能为空");
            }
            return;
        }
        if (TextUtils.isEmpty(pwd)) {
            if (view != null) {
                view.onFail("密码不能为空");
            }
            return;
        }

        if (model != null) {
            model.login(name, pwd, this);
        }
    }

    @Override
    public void onSuccess(LoginBean loginBean) {
        if (view != null) {
            view.onSuccess(loginBean);
        }
    }

    @Override
    public void onFail(String error) {
        if (view != null) {
            view.onFail(error);
        }
    }
}
