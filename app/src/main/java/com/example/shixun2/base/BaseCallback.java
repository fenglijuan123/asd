package com.example.shixun2.base;

public interface BaseCallback<T, K> {
    void onSuccess(T t);

    void onFail(K k);

}
