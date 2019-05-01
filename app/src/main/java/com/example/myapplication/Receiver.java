package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

       String tag="Receiver";
        Log.d("TestReceiver","intents="+intent);
        String message=intent.getStringExtra("message");
        Log.d(tag,message);
    }
}
