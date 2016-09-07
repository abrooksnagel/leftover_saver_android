package com.example.android.leftoversaver;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.List;

//import co.uk.rushorm.core.RushSearch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSave(View view) {
        Intent saveIntent = new Intent(MainActivity.this, SaveActivity.class);
        startActivity(saveIntent);
    }

    public void goToShow(View view) {
        Intent showIntent = new Intent(MainActivity.this, ShowActivity.class);
        startActivity(showIntent);
    }
}


