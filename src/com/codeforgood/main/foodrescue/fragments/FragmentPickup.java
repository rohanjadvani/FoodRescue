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
import android.util.Log;
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
    List<String> names;
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
        names = new ArrayList<String>();
        initLocations();
        setupMap();
        initButtons();
        findButtons(view);
        setListeners();
        return view;
    }

    private void initLocations() {
        // I'm going to hard code this because JSON sucks.
        positions.add(new LatLng(40.749064, -73.992713));
        names.add("Starbucks");
        positions.add(new LatLng(40.721201, -74.000567));
        names.add("Starbucks Soho");
        positions.add(new LatLng(40.735372, -73.990417));
        names.add("Panera");
    }

    private void setupMap() {
        map = ((SupportMapFragment) getFragmentManager().findFragmentById(
                R.id.map)).getMap();
        map.setOnMarkerClickListener(this);
        // load positions
        for (int index = 0; index < positions.size(); index++) {
            map.addMarker(new MarkerOptions().position(positions.get(index))
                    .title(names.get(index)));
        }
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(positions.get(0), 15));
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
