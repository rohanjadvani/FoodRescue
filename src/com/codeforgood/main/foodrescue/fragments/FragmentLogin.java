package com.codeforgood.main.foodrescue.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Login fragment
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentLogin extends Fragment {

    View view;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_login, container, false);
    }

}
