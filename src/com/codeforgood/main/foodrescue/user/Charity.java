package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Charity {

    private String email;
    private String password;
    private String name;
    private Location location;
    private String phone;
    private String username;

    public Charity(String password, String name, Location location,
            String phone, String email, String username) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.location = location;
        this.phone = phone;
        this.username = username;
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

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

}
