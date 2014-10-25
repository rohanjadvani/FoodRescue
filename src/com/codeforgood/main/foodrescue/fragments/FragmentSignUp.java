package com.codeforgood.main.foodrescue.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;

import com.codeforgood.main.foodrescue.R;

/**
 * Sign up fragment.
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentSignUp extends Fragment {

    Context mContext;
    RadioButton volunteer;
    RadioButton restaurant;
    RadioButton charity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_signup, container, false);
        mContext = getActivity().getApplicationContext();
        initButtons();
        findButtons(view);
        return view;
    }

    private void initButtons() {
        volunteer = new RadioButton(mContext);
        restaurant = new RadioButton(mContext);
        charity = new RadioButton(mContext);
    }

    private void findButtons(View view) {
        volunteer = (RadioButton) view.findViewById(R.id.button_volunteer);
        restaurant = (RadioButton) view.findViewById(R.id.button_restaurant);
        charity = (RadioButton) view.findViewById(R.id.button_charity);
    }

}
