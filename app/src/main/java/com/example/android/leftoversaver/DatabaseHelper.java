//package com.example.android.leftoversaver;
//
//import com.example.android.leftoversaver.LeftoverDatabase.Leftover;
//
//import android.app.DatePickerDialog;
//import android.app.Dialog;
//import android.app.DialogFragment;
//import android.app.TimePickerDialog;
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//import android.os.Bundle;
//import android.text.format.DateFormat;
//import android.util.Log;
//import android.view.View;
//import android.widget.DatePicker;
//import android.widget.EditText;
//import android.widget.TimePicker;
//import android.widget.Toast;



//public class DatabaseHelper extends SQLiteOpenHelper {
//    public static final int DATABASE_VERSION = 1;
//    public static final String DATABASE_NAME = "LeftoverSaver.db";
//
//    private static final String TEXT_TYPE = " TEXT";
//    private static final String COMMA_SEP = ",";
//    private static final String SQL_CREATE_ENTRIES =
//            "CREATE TABLE " + Leftover.TABLE_NAME + " (" +
//                    Leftover._ID + " INTEGER PRIMARY KEY," +
//                    Leftover.COLUMN_NAME_FOODITEM + TEXT_TYPE + COMMA_SEP +
//                    Leftover.COLUMN_NAME_DATE + TEXT_TYPE + COMMA_SEP +
//                    Leftover.COLUMN_NAME_TIME + TEXT_TYPE +
//                    ")";
//
//    private static final String SQL_DELETE_ENTRIES =
//            "DROP TABLE IF EXISTS " + Leftover.TABLE_NAME;
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        Log.d("Database Helper", "Database created");
//    }
//
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(SQL_CREATE_ENTRIES);
//        Log.d("Database Helper", "Table created");
//    }
//
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL(SQL_DELETE_ENTRIES);
//        onCreate(db);
//    }
//
//    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        onUpgrade(db, oldVersion, newVersion);
//    }
//
//    /**
//     * This method will persist entries to database
//     * @param foodItem
//     * @param date
//     * @param time
//     */
//    public void saveItem(DatabaseHelper da, String foodItem, String date, String time) {
//
//        SQLiteDatabase db = da.getWritableDatabase();

        //(((((((((((((((((((((((((()))))))))))))))))))))))))\\
        //  Delete this code if the code following it works  \\
        //(((((((((((((((((((((((((()))))))))))))))))))))))))\\
//        ContentValues values = new ContentValues();
//        values.put(LeftoverDatabase.Leftover.COLUMN_NAME_FOODITEM,
//                ((EditText) findViewById(R.id.food_item_entry)).getText().toString());
//        values.put(LeftoverDatabase.Leftover.COLUMN_NAME_DATE,
//                ((EditText) findViewById(R.id.date_button)).getText().toString());
//        values.put(LeftoverDatabase.Leftover.COLUMN_NAME_TIME,
//                ((EditText) findViewById(R.id.time_button)).getText().toString());





//This goes with the top section of code

//        ContentValues values = new ContentValues();
//        values.put(Leftover.COLUMN_NAME_FOODITEM, foodItem);
//        values.put(Leftover.COLUMN_NAME_DATE, date);
//        values.put(Leftover.COLUMN_NAME_TIME, time);
//
//
//        long newRowId;
//        newRowId = db.insert(Leftover.TABLE_NAME, null, values);
//        Log.d("Database Helper", "One row inserted");
//    }
//
//    public Cursor showItems(DatabaseHelper da) {
//
//        SQLiteDatabase db = da.getReadableDatabase();
//        String where = null;
//        String[] columns = {Leftover._ID,
//                            Leftover.COLUMN_NAME_FOODITEM,
//                            Leftover.COLUMN_NAME_DATE,
//                            Leftover.COLUMN_NAME_TIME};
//
//        Cursor c = db.query(Leftover.TABLE_NAME, columns, where, null, null, null, null);
//        if (c != null) {
//            c.moveToFirst();
//        }
//        return c;
//    }
//
//}






