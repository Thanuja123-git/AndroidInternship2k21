package com.example.notificationstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager manager;
    private static final String PRIMARY_CHANNEL_ID ="primary_notification_channel";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSystemService(NOTIFICATION_SERVICE);
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT>=android.os.Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel(PRIMARY_CHANNEL_ID,"Mascot Notification",NotificationManager.IMPORTANCE_HIGH);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(Color.RED);
            notificationChannel.enableVibration(true);
            notificationChannel.setDescription("Notification from Mascot");
            manager.createNotificationChannel(notificationChannel);
        }
    }

    public void submit(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,PRIMARY_CHANNEL_ID);
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("My First Notification");
        builder.setContentText("Hello, Good morning");
        Intent i = new Intent(this,MainActivity.class);
        PendingIntent pi = PendingIntent.getActivity(this,1,i,PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pi);
        builder.setAutoCancel(true);
        builder.addAction(R.mipmap.ic_launcher,"Reply",pi);
        Bitmap b = BitmapFactory.decodeResource(getResources(),R.drawable.kickwall);
        builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(b));
        manager.notify(1,builder.build());
    }
}