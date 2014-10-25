package com.codeforgood.main.foodrescue.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.codeforgood.main.foodrescue.R;

/**
 * Volunteer fragment.
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentVolunteer extends Fragment implements OnClickListener {

    Context mContext;
    Button nearbyPickup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_volunteer, container,
                false);
        mContext = getActivity().getApplicationContext();
        initButtons();
        findButtons(view);
        setListeners();
        return view;
    }

    private void initButtons() {
        nearbyPickup = new Button(mContext);
    }

    private void findButtons(View view) {
        nearbyPickup = (Button) view.findViewById(R.id.search_nearby_pickups);
    }

    private void setListeners() {
        nearbyPickup.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_nearby_pickups:
                pickupFragment();
                break;
        }
    }

    private void pickupFragment() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, new FragmentPickup());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

}
