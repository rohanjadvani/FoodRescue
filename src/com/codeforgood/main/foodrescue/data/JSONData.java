package com.codeforgood.main.foodrescue.data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Data of all restaurants participating.
 * 
 * @author Rohan Jadvani
 *
 */
public class JSONData {

    public static JSONObject starbucks = new JSONObject();
    static {
        try {
            starbucks.put("name", "Starbucks");
            starbucks.put("email", "star@bucks.com");
            starbucks.put("username", "starbucks");
            starbucks.put("password", "sbucks");
            starbucks.put("phone", "123-456-7890");
            starbucks.put("latitude", 40.749064);
            starbucks.put("longtitude", -73.992713);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject starbuckssoho = new JSONObject();
    static {
        try {
            starbuckssoho.put("name", "StarbucksSoho");
            starbuckssoho.put("email", "star@buckssoho.com");
            starbuckssoho.put("username", "starbuckssoho");
            starbuckssoho.put("password", "sbuckssoho");
            starbuckssoho.put("phone", "123-456-7890");
            starbuckssoho.put("latitude", 40.721201);
            starbuckssoho.put("longtitude", -74.000567);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject panera = new JSONObject();
    static {
        try {
            panera.put("name", "Panera");
            panera.put("email", "pan@era.com");
            panera.put("username", "panera");
            panera.put("password", "pan");
            panera.put("phone", "123-456-7890");
            panera.put("latitude", 40.735372);
            panera.put("longtitude", -73.990417);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static JSONArray data = new JSONArray();
    static {
        data.put(starbucks);
        data.put(starbuckssoho);
        data.put(panera);
    }

}
