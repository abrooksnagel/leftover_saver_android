package com.abrooksnagel.android.leftoversaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.abrooksnagel.android.leftoversaver.R.layout.activity_main);
    }

    public void goToSave(View view) {
        Intent saveIntent = new Intent(MainActivity.this, SaveActivity.class);
        startActivity(saveIntent);
    }

    public void goToShow(View view) {
        Intent showIntent = new Intent(MainActivity.this, ShowActivity.class);
        startActivity(showIntent);
    }

//    AlarmManager alarmMgr = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//    Intent intent = new Intent(this, AlarmReceiver.class);
//    PendingIntent alarmIntent = PendingIntent.getBroadcast(this, 0, intent, 0);
//// set for 30 seconds later
//    alarmMgr.set(AlarmManager.RTC, Calendar.getInstance().getTimeInMillis() + 30000, alarmIntent);
}


