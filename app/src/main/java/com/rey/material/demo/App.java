package com.rey.material.demo;

import android.app.Application;

import com.rey.material.app.ThemeManager;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ThemeManager.init(this, 2, 0, null);
    }
}
