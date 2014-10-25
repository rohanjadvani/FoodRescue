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
    private boolean isOpen;
    private String openTime;
    private String closeTime;

    public Charity(String email, String password, String passwordconfirmation, String name, Location location, String openTime, String closeTime) {
        this.email = email;
        this.password = password
        this.passwordconfirmation = passwordconfirmation
        this.name = name;
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime
    }

}
