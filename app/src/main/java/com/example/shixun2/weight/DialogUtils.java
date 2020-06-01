package com.example.shixun2.weight;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.shixun2.R;

public class DialogUtils extends ProgressDialog {
    public DialogUtils(Context context) {
        super(context);
    }
 
    public DialogUtils(Context context, int theme) {
        super(context, theme);
    }
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        init(getContext());
    }
 
    private void init(Context context) {
        setCancelable(true);
        setCanceledOnTouchOutside(false);
 
        setContentView(R.layout.loading);//loading的xml文件
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width = WindowManager.LayoutParams.WRAP_CONTENT;
        params.height = WindowManager.LayoutParams.WRAP_CONTENT;
        getWindow().setAttributes(params);
    }
 
    @Override
    public void show() {//开启
        super.show();
    }
 
    @Override
    public void dismiss() {//关闭
        super.dismiss();
    }
}