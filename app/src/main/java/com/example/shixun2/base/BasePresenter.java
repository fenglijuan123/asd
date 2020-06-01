package com.example.shixun2.base;

public abstract class BasePresenter<M extends BaseModel, V extends BaseView> {

    protected M model;
    protected V view;

    public void model(M model) {
        this.model = model;
    }

    public void view(V view) {
        this.view = view;
    }
}
