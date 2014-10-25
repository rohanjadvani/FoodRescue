package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Restaurant {
    private String name;
    private Location location;
    private String phone;
    private String email;

    public Restaurant(String name, Location location, String phone, String email){
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.email = email;
    }

    public Location getLocation(){
        return location;
    }
}
