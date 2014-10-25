package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Restaurant {
    private String email;
    private String password;
    private String passwordconfirmation;
    private String name;
    private String phone;
    private Location location;

    public Restaurant(String password, String passwordconfirmation, String name, Location location, String phone, String email){
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.passwordconfirmation = passwordconfirmation;
    }

    public Location getLocation(){
        return location;
    }
}
