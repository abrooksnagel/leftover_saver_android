package com.example.android.leftoversaver;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

/**
 * Created by abrooksnagel on 6/13/16.
 */
//public class LeftoverCursorAdapter extends CursorAdapter {
//    private LayoutInflater cursorInflater;
//    public LeftoverCursorAdapter(Context context, Cursor cursor, int flags) {
//        super(context, cursor, 0);
//        cursorInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//    }
//
//    public View newView(Context context, Cursor cursor, ViewGroup parent) {
//        return cursorInflater.inflate(R.layout.show_activity, parent, false);
//    }
//
//    public void bindView(View view, Context context, Cursor cursor) {
//        TextView saved_food_item = (TextView) view.findViewById(R.id.saved_food_item);
//        TextView saved_date = (TextView) view.findViewById(R.id.saved_date);
//        TextView saved_time = (TextView) view.findViewById(R.id.saved_time);
//
//        String foodItem = cursor.getString(cursor.getColumnIndex(LeftoverDatabase.Leftover.COLUMN_NAME_FOODITEM));
//        String date = cursor.getString(cursor.getColumnIndex(LeftoverDatabase.Leftover.COLUMN_NAME_DATE));
//        String time = cursor.getString(cursor.getColumnIndex(LeftoverDatabase.Leftover.COLUMN_NAME_TIME));
//
//        saved_food_item.setText(foodItem);
//        saved_date.setText(date);
//        saved_time.setText(time);
//    }
//}
