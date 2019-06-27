package com.example.week4day3;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import org.greenrobot.eventbus.EventBus;

public class MyIntentService extends IntentService {
    public static final String ACTION_LAUGH="action.laugh";
    public static final String ACTION_CRY="action.cry";
    public void f(View v){
        ((Activity)(v.getContext())).runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Log.d("TAG", "run: dsdsds");
            }
        });
    }
    public MyIntentService() {
        super("");
    }

    public MyIntentService(String name) {
        super(name);
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        switch(intent.getAction()){
            case ACTION_LAUGH:
                EventBus.getDefault().post(new MessageEvent("WorldBreaker"));
                break;
            case ACTION_CRY:
                EventBus.getDefault().post(new MessageEvent("Judgement"));
                break;
        }
    }
}
