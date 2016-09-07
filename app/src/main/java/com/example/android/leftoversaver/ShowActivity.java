package com.example.android.leftoversaver;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//import co.uk.rushorm.core.RushSearch;


/**
 * Created by abrooksnagel on 6/10/16.
 */
public class ShowActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leftover_list);

        List<Leftover> leftovers = Leftover.listAll(Leftover.class);

        LeftoverAdapter leftoverAdapter = new LeftoverAdapter(this, leftovers);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(leftoverAdapter);


        String leftoverString = leftovers.toString();
        Log.v("SHOW right here", leftoverString);
        Toast.makeText(getBaseContext(), "Food item shown", Toast.LENGTH_LONG).show();

        //Find an alternative to finish() to end this activity - possibly back button?
//        finish();
    }


}











