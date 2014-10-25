package com.codeforgood.main.foodrescue.user;

import com.codeforgood.main.foodrescue.request.Request;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Volunteer extends User {

    private String firstname;
    private String lastname;
    private boolean isLeadRescuer;
    private Request[] listOfRequests;
    private boolean hasTraining;

    public Volunteer(String email, String password, String firstname,
            String lastname, String phone, String username) {
        super(email, username, password, phone, null);
        this.firstname = firstname;
        this.lastname = lastname;
        this.isLeadRescuer = false;
        this.hasTraining = false;

    }

    public void setLocation(double latitude, double longitude) {
        location.setLatitude(latitude);
        location.setLongitude(longitude);
    }

    public void setHasTraining() {
        hasTraining = true;
    }

    public void setIsLeadRescuer() {
        if (hasTraining == true) {
            isLeadRescuer = true;
        } else {
            isLeadRescuer = false;
        }
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public boolean isLR() {
        return isLeadRescuer;
    }

}
