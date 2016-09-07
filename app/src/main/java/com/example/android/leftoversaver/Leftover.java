package com.example.android.leftoversaver;

import com.orm.SugarRecord;

/**
 * Created by abrooksnagel on 9/2/16.
 */
public class Leftover extends SugarRecord {
    private String foodItem;
    private String savedDate;
    private String savedTime;

    @Override
    public String toString() {
        return String.format("You saved " + foodItem + " on " + savedDate + " at " + savedTime);
    }



    public Leftover() {
    }


    public Leftover(String foodItem, String savedDate, String savedTime) {
        this.foodItem = foodItem;
        this.savedDate = savedDate;
        this.savedTime = savedTime;
    }

    public String getFoodItem() {
        return this.foodItem;
    }
    public String getSavedDate() {
        return this.savedDate;
    }
    public String getSavedTime() {
        return this.savedTime;
    }
}







