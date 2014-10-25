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

    static JSONObject starbucks = new JSONObject();
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

    public static JSONArray data = new JSONArray();
    static {
        try {
            data.put(0, starbucks);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}
