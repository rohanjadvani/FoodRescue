package com.codeforgood.main.foodrescue.user;

import android.location.Location;

import com.codeforgood.main.foodrescue.request.Request;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Volunteer {
    private String firstname;
    private String lastname;
    private String email;
    private String username;
    private String password;
    private String phone;
    private boolean isLeadRescuer;
    private Location location;
    private Request[] listOfRequests;
    private boolean hasTraining;

    public Volunteer(String email, String password,
                     String firstname, String lastname, String phone, String username){
	       this.email = email;
	       this.password = password;
	       this.firstname = firstname;
	       this.lastname = lastname;
	       this.phone = phone;
	       this.username = username;
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
    public String getEmail(){
    	return email;
    }
    public String getPassword(){
    	return password;
    }
    public String getFirstName(){
    	return firstname;
    }
    public String getLastName(){
    	return lastname;
    }	
    public String getPhone(){
    	return phone;
    }
    public String getUsername(){
    	return username;
    }
    public Location getLocation(){
    	return location;
    }
    public boolean isLR(){
    	return isLeadRescuer;
    }


}
