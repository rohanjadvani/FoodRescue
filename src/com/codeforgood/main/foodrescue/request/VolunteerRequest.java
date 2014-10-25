package com.codeforgood.main.foodrescue.request;

import com.codeforgood.main.foodrescue.user.Charity;
import com.codeforgood.main.foodrescue.user.Volunteer;

/**
 * Created by kevinchon on 10/24/14.
 */
public class VolunteerRequest extends Request {
    private Charity charity;
    private Volunteer volunteer;

    public VolunteerRequest(String date, String time, String typeOfFood,
                            int weightOfFood, Volunteer volunteer){
        super(date, time, typeOfFood, weightOfFood);
        this.volunteer =  volunteer;
    }

    public Volunteer getVolunteerOfRequest(){
        return volunteer;
    }

    public void chooseCharity(Charity c){
        if(volunteer.isLR() == true){
            charity = c;
        }
        else {
            charity = null;
        }
    }
    public Charity getCharity(){
        return charity;
    }
    public Volunteer getVolunteer(){
        return volunteer;
    }

}
