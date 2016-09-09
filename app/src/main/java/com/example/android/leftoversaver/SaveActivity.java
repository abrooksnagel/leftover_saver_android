package com.example.android.leftoversaver;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class SaveActivity extends AppCompatActivity {

//    Button notificationButton;

    @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_activity);


//Code for notification
//        notificationButton = (Button) findViewById(R.id.notification_button);
//        notificationButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//                PendingIntent pendingIntent = PendingIntent.getActivity(, 0, intent, 0);
//            }
//        });
    }

    public void saveItem(View v) {

        EditText foodItemText = (EditText)findViewById(R.id.food_item_entry);
        String foodItemString = foodItemText.getText().toString();

        TextView savedDateText = (TextView)findViewById(R.id.date_button);
        String savedDateString = savedDateText.getText().toString();

        TextView savedTimeText = (TextView)findViewById(R.id.time_button);
        String savedTimeString = savedTimeText.getText().toString();


        Leftover object = new Leftover(foodItemString, savedDateString, savedTimeString);
        object.save();

        Toast.makeText(getBaseContext(), "Food item saved", Toast.LENGTH_SHORT).show();
        finish();
    }

//Datepicker
    public static class DatePickerFragment extends DialogFragment
                implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            final Calendar c = Calendar.getInstance();

            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);


            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            String yearString = Integer.toString(year);
            String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            String monthString = months[month];
            String dayString = Integer.toString(day);

            // Display the date on screen
            TextView editDateText = (TextView)getActivity(). findViewById(R.id.date_button);
            editDateText.setText(monthString + " " + dayString + ", " + yearString);
        }
    }

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }

//Time picker
    public static class TimePickerFragment extends DialogFragment
            implements TimePickerDialog.OnTimeSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current time as the default values for the picker
            final Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            int minute = c.get(Calendar.MINUTE);

            // Create a new instance of TimePickerDialog and return it
            return new TimePickerDialog(getActivity(), this, hour, minute,
                    DateFormat.is24HourFormat(getActivity()));
        }

        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            String hourString;
            String periodString;
            String minuteString;

            if (hourOfDay > 0 && hourOfDay < 12) {
                hourString = Integer.toString(hourOfDay);
                periodString = " a.m.";
            } else if (hourOfDay == 12) {
                hourString = Integer.toString(hourOfDay);
                periodString = " p.m.";
            } else if (hourOfDay > 12 && hourOfDay < 24) {
                hourString = Integer.toString(hourOfDay - 12);
                periodString = " p.m.";
            } else {
                hourString = Integer.toString(hourOfDay + 12);
                periodString = " a.m.";
            }

            if (minute < 10) {
                minuteString = "0" + Integer.toString(minute);
            } else {
                minuteString = Integer.toString(minute);
            }

            // Display the time on screen
            TextView editDateText = (TextView)getActivity(). findViewById(R.id.time_button);
            editDateText.setText(hourString + ":" + minuteString + periodString);
        }
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }
}


