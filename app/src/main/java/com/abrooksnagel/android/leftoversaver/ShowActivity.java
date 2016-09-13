package com.abrooksnagel.android.leftoversaver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.abrooksnagel.android.leftoversaver.R.layout.leftover_list);

        List<Leftover> leftovers = Leftover.listAll(Leftover.class);

        LeftoverAdapter leftoverAdapter = new LeftoverAdapter(this, leftovers);
        ListView listView = (ListView) findViewById(com.abrooksnagel.android.leftoversaver.R.id.list);
        listView.setAdapter(leftoverAdapter);
    }
}











