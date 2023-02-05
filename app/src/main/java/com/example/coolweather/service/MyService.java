package com.example.coolweather.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.coolweather.MainActivity;
import com.example.coolweather.R;

public class MyService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService", "onCreate Service");
        Intent intent = new Intent(this, MainActivity.class);

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                stopSelf();
            }
        }).start();
        return super.onStartCommand(intent, flags, startId);
    }
}
