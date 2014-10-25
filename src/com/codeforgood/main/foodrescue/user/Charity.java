package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Charity extends User{
    private String name;

    public Charity(String password, String name, Location location,
            String phone, String email, String username) {
        super(email, username, password, phone, location);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
