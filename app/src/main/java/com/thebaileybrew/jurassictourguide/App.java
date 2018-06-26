package com.thebaileybrew.jurassictourguide;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private static Context appContext;

    public static Context getContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }
}
