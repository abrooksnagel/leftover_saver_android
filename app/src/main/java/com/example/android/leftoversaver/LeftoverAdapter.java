package com.example.android.leftoversaver;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

        TextView foodTextView = (TextView) listItemView.findViewById(R.id.saved_food_item);
        foodTextView.setText("You saved " +currentLeftover.getFoodItem() + " on");

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.saved_date);
        dateTextView.setText(currentLeftover.getSavedDate());

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.saved_time);
        timeTextView.setText(" at " + currentLeftover.getSavedTime());

        Button deleteButton = (Button) listItemView.findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentLeftover.delete(); //Deletes from database
                Log.v("Testing onClick", currentLeftover.toString());

                remove(currentLeftover); //Removes from the adapter
                notifyDataSetChanged();
            }
        });

        return listItemView;
    }
}
