package com.shephertz.logcheck;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "LogDebug";

    public static void checkLog(String log)
    {
        Log.e(TAG,log);
            
    }
}
