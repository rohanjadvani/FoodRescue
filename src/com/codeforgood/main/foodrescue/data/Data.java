package com.codeforgood.main.foodrescue.data;

import com.codeforgood.main.foodrescue.user.Restaurant;
import com.google.android.gms.maps.model.LatLng;

/**
 * Hard coded stuff
 * 
 * @author Rohan Jadvani
 *
 */
public class Data {

    public static final Restaurant STARBUCKS = new Restaurant(null,
            "Starbucks", new LatLng(40.749, -73.993), "(212) 953-1662", null,
            null);

    public static final Restaurant STARBUCKS_SOHO = new Restaurant(null,
            "Starbucks Soho", new LatLng(40.721, -74.000657),
            "(212) 219-2961)", null, null);

    public static final Restaurant PANERA = new Restaurant(null, "Panera",
            new LatLng(40.735, -73.990), "(212) 828-7028", null, null);

}
