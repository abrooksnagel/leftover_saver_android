package com.example.android.leftoversaver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leftover_list);

        List<Leftover> leftovers = Leftover.listAll(Leftover.class);

        LeftoverAdapter leftoverAdapter = new LeftoverAdapter(this, leftovers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(leftoverAdapter);

        String leftoverString = leftovers.toString();
        Log.v("SHOW right here", leftoverString);
        Toast.makeText(getBaseContext(), "Food item shown", Toast.LENGTH_LONG).show();

    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        setContentView(R.layout.leftover_list);
//
//        List<Leftover> leftovers = Leftover.listAll(Leftover.class);
//
//        LeftoverAdapter leftoverAdapter = new LeftoverAdapter(this, leftovers);
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setAdapter(leftoverAdapter);
//
//    }
}











