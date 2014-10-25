package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Charity {
	private String email;
    private String password;
    private String passwordconfirmation;
    private String name;
    private Location location;
    private String openTime;
    private String closeTime;

    public Charity(String email, String password, String passwordconfirmation, String name, Location location, String openTime, String closeTime) {
        if (password = passwordconfirmation) {
	        this.email = email;
	        this.password = password
	        this.passwordconfirmation = passwordconfirmation
	        this.name = name;
	        this.location = location;
	        this.openTime = openTime;
	        this.closeTime = closeTime
	    }
	    else{
	    	System.out.println("Passwords Do Not Match")
	    }
    }
    public Location getLocation(){
        return location;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getOpenTime(){
        return openTime;
    }
    public String getCloseTime(){
        return closeTime;
    }
    public String getName(){
        return name;
    }

}
