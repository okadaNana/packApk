package com.owen.packapk.utils;

import android.util.Log;

import com.owen.packapk.BuildConfig;

/**
 * 日志工具类
 *
 * Created by Owen on 2016/5/16.
 */
public class LogUtil {

    private static final String TAG = "LogUtil";

    public static void d(String info) {
        if (BuildConfig.LOG_DEBUG) {
            Log.d(TAG, info);
        }
    }

}
