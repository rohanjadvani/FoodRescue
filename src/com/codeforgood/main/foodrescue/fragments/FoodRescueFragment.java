package com.codeforgood.main.foodrescue.fragments;

import com.codeforgood.main.foodrescue.Main;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * 
 * @author Rohan Jadvani
 *
 */
public abstract class FoodRescueFragment extends Fragment {

    /**
     * Differentiate fragments with id numbers.
     * 
     * @return id number of fragment
     */
    public abstract int getFragmentId();
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Main main = (Main) activity;
        // TODO something with the user
    }
    
    public void onResume() {
        super.onResume();
        Main main = (Main) getActivity();
        //TODO set current fragment
    }
    
    /*
     * TODO some stuff with user
     */
    
}
