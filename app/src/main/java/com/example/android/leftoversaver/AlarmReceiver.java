//package com.example.android.leftoversaver;
//
//import android.app.Notification;
//import android.app.NotificationManager;
//import android.app.PendingIntent;
//import android.content.BroadcastReceiver;
//import android.content.Context;
//import android.content.Intent;
//import android.support.v4.app.NotificationCompat;
//
///**
// * Created by abrooksnagel on 9/7/16.
// */
//public class AlarmReceiver extends BroadcastReceiver {
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
//
//        Notification notification = new NotificationCompat.Builder(context)
//                .setContentTitle("Random title")
//                .setContentText("Random text")
//                .setSmallIcon(R.drawable.abc_ic_go_search_api_mtrl_alpha)
//                .setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 0))
//                .build();
//
//        notificationManager.notify(0, notification);
//    }
//
//
//}

