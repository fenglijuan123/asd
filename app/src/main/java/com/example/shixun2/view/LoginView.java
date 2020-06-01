package com.example.shixun2.view;


import com.example.shixun2.base.BaseView;
import com.example.shixun2.bean.LoginBean;

public interface LoginView extends BaseView<LoginBean, String> {
    @Override
    void onSuccess(LoginBean loginBean);

    @Override
    void onFail(String s);
}
