package com.example.week4day3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import org.greenrobot.eventbus.EventBus;

import static android.content.ContentValues.TAG;

public class NormalService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int counter=0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter++;
            Log.d(TAG, "onStartCommand: "+counter);
            if (counter>10){
                stopSelf();
                break;
            }
        }
        EventBus.getDefault().post(new MessageEvent("finsih with count of "+counter));
        return super.onStartCommand(intent, flags, startId);
    }
}
