package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Restaurant extends User{
    private String name;

    public Restaurant(String password, String name, Location location, String phone, String email, String username){
        super(email, username, password, phone, location);
        this.name = name;
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
    public String getPhone(){
        return phone;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
}
