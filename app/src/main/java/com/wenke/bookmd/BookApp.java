package com.wenke.bookmd;

import android.app.Application;
import android.content.Context;

/**
 * Created by wenke on 2017/8/3.
 */

public class BookApp extends Application {

    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = this;
    }

    public static Context getContext() {

        return mAppContext;
    }

}
