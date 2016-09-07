package com.example.android.leftoversaver;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;


import java.util.Calendar;

public class SaveActivity extends AppCompatActivity {

    @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_activity);
    }

    public void saveItem(View v) {

        EditText foodItemText = (EditText)findViewById(R.id.food_item_entry);
        String foodItemString = foodItemText.getText().toString();

        EditText savedDateText = (EditText)findViewById(R.id.date_button);
        String savedDateString = savedDateText.getText().toString();

        EditText savedTimeText = (EditText)findViewById(R.id.time_button);
        String savedTimeString = savedTimeText.getText().toString();


        Leftover object = new Leftover(foodItemString, savedDateString, savedTimeString);
        object.save();

        String objectString = object.toString();
        Log.v("SAVE right here", objectString);
        Toast.makeText(getBaseContext(), "Food item saved", Toast.LENGTH_LONG).show();
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
            String monthString = Integer.toString(month);
            String dayString = Integer.toString(day);
            Log.v("Testing DatePicker", monthString + dayString + yearString);

            // Display the date on screen
            EditText editDateText = (EditText)getActivity(). findViewById(R.id.date_button);
            editDateText.setText(monthString + dayString + yearString);


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
            String hourString = Integer.toString(hourOfDay);
            String minuteString = Integer.toString(minute);
            Log.v("Testing TimePicker", hourString + minuteString);

            // Display the time on screen
            EditText editDateText = (EditText)getActivity(). findViewById(R.id.time_button);
            editDateText.setText(hourString + minuteString);

        }
    }

    public void showTimePickerDialog(View v) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getFragmentManager(), "timePicker");
    }

}


