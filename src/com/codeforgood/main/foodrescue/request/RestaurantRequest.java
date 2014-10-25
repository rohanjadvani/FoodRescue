package com.codeforgood.main.foodrescue.request;

import com.codeforgood.main.foodrescue.user.Volunteer;

/**
 * Created by kevinchon on 10/24/14.
 */
public class RestaurantRequest extends Request {

    private int numOfVolunteers;
    private Volunteer[] volunteers;

    public RestaurantRequest(String date, String time, String typeOfFood,
            int weightOfFood) {
        super(date, time, typeOfFood, weightOfFood);
    }

    private void setNumOfVolunteers(int weightOfFood) {
        if (weightOfFood < 15) {
            volunteers = new Volunteer[1];
            numOfVolunteers = 1;
        } else {
            volunteers = new Volunteer[(weightOfFood % 15) + 1];
            numOfVolunteers = (weightOfFood % 15) + 1;
        }
    }
    public void setLocation(Restaurant r){
        location = r.location;
    }

}
