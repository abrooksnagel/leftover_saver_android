package com.example.android.leftoversaver;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by abrooksnagel on 9/3/16.
 */
public class LeftoverAdapter extends ArrayAdapter<Leftover> {

    /**
     * Create a new LeftoverAdapter object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param leftovers is the list of Leftovers to be displayed.
     */
    public LeftoverAdapter(Activity context, List<Leftover> leftovers) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, leftovers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.show_activity, parent, false);
        }


        // Get the Leftover object located at this position in the list
        final Leftover currentLeftover = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView foodTextView = (TextView) listItemView.findViewById(R.id.saved_food_item);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        foodTextView.setText("You saved " +currentLeftover.getFoodItem());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.saved_date);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        dateTextView.setText("on " +currentLeftover.getSavedDate());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView timeTextView = (TextView) listItemView.findViewById(R.id.saved_time);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        timeTextView.setText("at " + currentLeftover.getSavedTime());

        Button deleteButton = (Button) listItemView.findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentLeftover.delete();

            }

        });

        return listItemView;

    }

}
