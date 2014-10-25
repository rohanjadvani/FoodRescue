package com.codeforgood.main.foodrescue.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codeforgood.main.foodrescue.R;

/**
 * Login fragment
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentLogin extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }

}
