package com.example.yokaa.movieapp.Volley;

import android.app.Application;
import android.content.Context;

/**
 * Created by yokaa on 11/17/16.
 */

public class MyApplication extends Application {

    public static MyApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance=this;

    }

    public static MyApplication getsInstance() {
        return sInstance;
    }

    public static Context getAppContext()
    {
        return sInstance.getApplicationContext();
    }
}
