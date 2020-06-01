package com.example.shixun2.bean;

import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

public class JsToAndroid {
    private Context mContext;

    public JsToAndroid(Context context) {
        this.mContext = context;
    }

    @JavascriptInterface
    public void hllo(String msg) {
        Log.e("TAG---", msg);

    }
}
