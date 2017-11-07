package com.example.jaderidge.subway_application_user;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import com.estimote.sdk.Beacon;
import com.estimote.sdk.BeaconManager;
import com.estimote.sdk.EstimoteSDK;
import com.estimote.sdk.Region;

import java.util.List;
import java.util.UUID;

/**
 * Created by Jaderidge on 2017-11-07.
 */

public class BeaconFinder extends Application {
    private BeaconManager beaconManager;

    public void onCreate(){
        super.onCreate();
        EstimoteSDK.initialize(getApplicationContext(), "APPID","APP TOKEN");

       beaconManager = new BeaconManager(getApplicationContext());
//        try {
//            beaconManager.connect(new BeaconManager.ServiceReadyCallback() {
//                @Override
//                public void onServiceReady() {
//                    beaconManager.startMonitoring(new Region("monitored region", UUID.fromString("E2C56DB5-DFFB-48D2-B060-D0F5A71096E0"), 0, 0));
//                }
//            });
//        }
//        catch (Exception e){
//            showNotification("에러", "비콘연결실패");
//        }
        showNotification("에러", "비콘연결실패");

        beaconManager.setMonitoringListener(new BeaconManager.MonitoringListener() {
            @Override
            public void onEnteredRegion(Region region, List<Beacon> list) {
                showNotification("들어옴", "비콘 연결됨" + list.get(0).getRssi());
            }

            @Override
            public void onExitedRegion(Region region) {
                showNotification("나감", "비콘 연결끊김");
            }
        });
    }

    public void showNotification(String title, String message){
        Intent notifyIntent = new Intent(this, MainActivity.class);
        notifyIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivities(this, 0, new Intent[] { notifyIntent }, PendingIntent.FLAG_UPDATE_CURRENT);

        Notification notification = new Notification.Builder(this)
                .setSmallIcon(android.R.drawable.ic_dialog_info)
                .setContentTitle(title)
                .setContentText(message)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .build();
        notification.defaults |= Notification.DEFAULT_SOUND;
        NotificationManager notificationManager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notification);
    }
}
