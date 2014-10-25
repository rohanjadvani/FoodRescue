package com.codeforgood.main.foodrescue.user;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.parse.ParseObject;

/**
 * User class
 * 
 * @author Rohan Jadvani
 *
 */
public abstract class User extends ParseObject {

    private String email;
    private String username;
    private String password;
    private String phone;
    protected LatLng location;

    public User(String email, String username, String password, String phone,
            LatLng location) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.location = location;
    }

    public LatLng getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }
}
