package com.codeforgood.main.foodrescue.request;

import android.location.Location;

import com.codeforgood.main.foodrescue.user.Restaurant;
import com.codeforgood.main.foodrescue.user.Volunteer;

/**
 * Created by kevinchon on 10/24/14.
 */
public abstract class Request {
    private String date;
    private String time;
    private String typeOfFood;
    private int weightOfFood;
    private int numOfVolunteers;
    private Volunteer[] volunteers;
    private Volunteer leadRescuer;
    private Location location;

    public Request(String date, String time, String typeOfFood, int weightOfFood){
        this.date = date;
        this.time = time;
        this.typeOfFood = typeOfFood;
        this.weightOfFood = weightOfFood;
        this.numOfVolunteers = 0;
    }

    private void setNumOfVolunteers(int weightOfFood) {
        if (weightOfFood < 15){
            volunteers = new Volunteer[1];
            numOfVolunteers = 1;
        }
        else{
            volunteers = new Volunteer[(weightOfFood % 15) + 1];
            numOfVolunteers = (weightOfFood % 15) + 1;
        }
    }

    public void setLocation(Restaurant restaurant){
        this.location = restaurant.getLocation();
    }

}
