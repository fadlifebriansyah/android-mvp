package com.example.androidjavamvp.app;

import android.app.Application;
import android.content.Context;

public class MVPApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        MVPApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MVPApplication.context;
    }
}