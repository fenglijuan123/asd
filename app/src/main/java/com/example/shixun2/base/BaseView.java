package com.example.shixun2.base;

public interface BaseView<T, K> {
    void onSuccess(T t);

    void onFail(K k);

}
