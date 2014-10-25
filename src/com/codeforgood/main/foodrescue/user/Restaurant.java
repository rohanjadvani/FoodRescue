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
        if (password = passwordconfirmation) {
            this.name = name;
            this.location = location;
            this.phone = phone;
            this.email = email;
            this.password = password;
            this.passwordconfirmation = passwordconfirmation;
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
    public String getPhone(){
        return phone;
    }
    public String getName(){
        return name;
    }
}
