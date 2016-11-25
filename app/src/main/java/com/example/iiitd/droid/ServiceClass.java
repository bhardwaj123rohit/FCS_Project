package com.example.iiitd.droid;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ServiceClass extends Service {

    /** indicates how to behave if the service is killed */
    //final Handler handler = new Handler();;
    int mStartMode;

    public final Handler handler = new Handler();
    /** interface for clients that bind */
    IBinder mBinder;

    /** indicates whether onRebind should be used */
    boolean mAllowRebind;

    /** Called when the service is being created. */
    @Override
    public void onCreate() {
       // Sync sync = new Sync(this,6000);


    }

    /** The service is starting, due to a call to startService() */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       // int i=1;
        try {
        while(true)
        {                Log.v("test", "this will run every minute");
                Thread.sleep(6000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


            return START_STICKY;
        }

    /** A client is binding to the service with bindService() */
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    /** Called when all clients have unbound with unbindService() */
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }

    /** Called when a client is binding to the service with bindService()*/
    @Override
    public void onRebind(Intent intent) {

    }

    /** Called when The service is no longer used and is being destroyed */
    @Override
    public void onDestroy() {

    }
}//https://www.google.co.in/search?client=ubuntu&channel=fs&q=how+to+run+service+indefinetely+even+with+restart&ie=utf-8&oe=utf-8&gfe_rd=cr&ei=fJQ4WOf-CMaL8QebhaDoDA#channel=fs&q=All+intents+android