package com.codeforgood.main.foodrescue.user;

import com.parse.ParseObject;

import android.location.Location;

/**
 * User class
 * 
 * @author Rohan Jadvani
 *
 */
public abstract class User extends ParseObject{

    private String email;
    private String username;
    private String password;
    private String phone;
    protected Location location;

    public User(String email, String username, String password, String phone,
            Location location) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.location = location;
    }

    public Location getLocation() {
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
