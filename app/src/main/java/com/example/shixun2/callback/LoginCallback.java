package com.example.shixun2.callback;


import com.example.shixun2.bean.LoginBean;

public interface LoginCallback {
    void onSuccess(LoginBean loginBean);

    void onFail(String error);
}
