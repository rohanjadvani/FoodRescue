package com.codeforgood.main.foodrescue.fragments;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codeforgood.main.foodrescue.R;
import com.codeforgood.main.foodrescue.data.JSONData;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Fragment class for finding nearby pickup locations. Features a map and list
 * of locations to select.
 * 
 * @author rohan
 *
 */
public class FragmentPickup extends Fragment implements OnMarkerClickListener {

    private static final LatLng NEW_YORK = new LatLng(40.7127, -74.0059);
    List<LatLng> positions;
    GoogleMap map;
    Context mContext;
    Button nearbyPickup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_pickup, container, false);
        mContext = getActivity().getApplicationContext();
        positions = new ArrayList<LatLng>();
        initLocations();
        setupMap();
        initButtons();
        findButtons(view);
        setListeners();
        return view;
    }

    private void initLocations() {
        JSONArray data = JSONData.data;
        // iterate through json array
        for (int index = 0; index < data.length(); index++) {
            try {
                JSONObject obj = data.getJSONObject(index);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void setupMap() {
        map = ((SupportMapFragment) getFragmentManager().findFragmentById(
                R.id.map)).getMap();
        map.setOnMarkerClickListener(this);
        Marker nyc = map.addMarker(new MarkerOptions().position(NEW_YORK)
                .title("New York City"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(NEW_YORK, 15));
    }

    private void initButtons() {
        // TODO Auto-generated method stub

    }

    private void findButtons(View view) {
        // TODO Auto-generated method stub

    }

    private void setListeners() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onMarkerClick(Marker arg0) {
        showConfirmation();
        return false;
    }

    private void showConfirmation() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, new FragmentConfirmPickup());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

}
