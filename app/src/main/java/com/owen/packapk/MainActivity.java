package com.owen.packapk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.owen.packapk.api.ApiContact;
import com.owen.packapk.utils.LogUtil;
import com.umeng.analytics.MobclickAgent;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "packApk_MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtil.d("这是一条Log日志");
        Log.d(TAG, "server: " + ApiContact.BASE_URL);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
}
