package com.codeforgood.main.foodrescue.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeforgood.main.foodrescue.R;

/**
 * Sign up fragment.
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentSignUp extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_signup, container, false);
        return view;
    }

}
