package com.example.sharedpreferencesandroid;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {

    private static final String MY_SHARE_PREFERENCES = "MY_SHARE_PREFERENCES";
    private Context mContext;

    public MySharedPreferences(Context mContext) {
        this.mContext = mContext;
    }

    public void putBooleanValue(String key, boolean value) {
        SharedPreferences sharedPreferences = mContext.getSharedPreferences(MY_SHARE_PREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.apply();
    }
}
