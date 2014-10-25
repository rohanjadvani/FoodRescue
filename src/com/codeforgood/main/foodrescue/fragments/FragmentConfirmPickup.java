package com.codeforgood.main.foodrescue.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeforgood.main.foodrescue.R;

/**
 * Class for confirming pickup
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentConfirmPickup extends Fragment {

    Context mContext;
    String address;
    String time;
    int weight;
    String description;
    String eventSpace;
    String leadRescuer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.pickup_location, container, false);
        mContext = getActivity().getApplicationContext();
        return view;
    }

}
