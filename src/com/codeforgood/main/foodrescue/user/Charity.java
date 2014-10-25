package com.codeforgood.main.foodrescue.user;

import android.location.Location;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Charity {

    private String name;
    private Location location;
    private boolean isOpen;
    private String openTime;
    private String closeTime;

    public Charity(String name, Location location) {
        this.name = name;
        this.location = location;
    }

}
