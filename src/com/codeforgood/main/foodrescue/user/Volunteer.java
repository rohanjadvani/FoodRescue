package com.example.kevinchon.foodrescue;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Volunteer {
    private String email;
    private String password;
    private String passwordconfirmation;
    private String firstname;
    private String lastname;
    private String phone;
    private Location location;
    private boolean isLeadRescuer;
    private Request[] listOfRequests;
    private boolean hasTraining;

    public Volunteer(String email, String password, String passwordconfirmation,
                     String firstname, String lastname, String phone){
        this.email = email;
        this.password = password;
        this.passwordconfirmation = passwordconfirmation;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.isLeadRescuer = false;
        this.hasTraining = false;
    }

    public void setLocation(float longitude, float latitude){
        location.setLongitude(longitude);
        location.setLatitude(latitude);
    }

    public void setHasTraining(){
        hasTraining = true;
    }

    public void setIsLeadRescuer(){
        if (hasTraining == true){
            isLeadRescuer = true;
        }
        else{
            isLeadRescuer = false;
        }
    }

}
