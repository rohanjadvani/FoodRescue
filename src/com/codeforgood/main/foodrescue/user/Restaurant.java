package com.codeforgood.main.foodrescue.user;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by kevinchon on 10/24/14.
 */
public class Restaurant extends User {

    private String name;

    public Restaurant(String password, String name, LatLng location,
            String phone, String email, String username) {
        super(email, username, password, phone, location);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
