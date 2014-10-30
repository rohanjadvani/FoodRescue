package com.codeforgood.main.foodrescue.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.codeforgood.main.foodrescue.R;
import com.google.android.gms.maps.model.LatLng;

/**
 * Class for confirming pickup
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentConfirmPickup extends Fragment implements OnClickListener {

    Context mContext;
    LatLng location;
    String restaurant;
    String address;
    String time = "30 min from now";
    String weight = "10 lbs";
    String description;
    String rescuer;
    TextView addressText;
    TextView timeText;
    TextView weightText;
    TextView descriptionText;
    TextView rescuerText;
    Button attend;

    public FragmentConfirmPickup(String restaurant) {
        this.restaurant = restaurant;
        if (restaurant.equalsIgnoreCase("Starbucks")) {
            location = new LatLng(40.749, -73.993);
            address = "1100+6th+Avenue+New+York+NY+10036";
            description = "coffee pickup";
            rescuer = "Yes!";
        } else if (restaurant.equalsIgnoreCase("Starbucks Soho")) {
            new LatLng(40.721, -74.000657);
            address = "471+Broadway+New+York+NY+10013";
            description = "coffee pickup!";
            rescuer = "Yes!";
        } else {
            new LatLng(40.735, -73.990);
            address = "120+East+86th+Street+New+York+NY+10028";
            description = "sandwich pickup";
            rescuer = "No";
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.pickup_location, container, false);
        mContext = getActivity().getApplicationContext();
        init(view);
        return view;
    }

    private void init(View view) {
        addressText = new TextView(mContext);
        addressText = (TextView) view.findViewById(R.id.address);
        timeText = new TextView(mContext);
        timeText = (TextView) view.findViewById(R.id.time);
        weightText = new TextView(mContext);
        weightText = (TextView) view.findViewById(R.id.weight);
        descriptionText = new TextView(mContext);
        descriptionText = (TextView) view.findViewById(R.id.description);
        rescuerText = new TextView(mContext);
        rescuerText = (TextView) view.findViewById(R.id.lead_rescuer);
        attend = new Button(mContext);
        attend = (Button) view.findViewById(R.id.attend_event_button);
        addressText.setText("Address: " + address);
        timeText.setText("Time for pickup: " + time);
        weightText.setText("Weight:" + weight);
        descriptionText.setText("Description: " + description);
        rescuerText.setText("Lead Rescuer " + rescuer);
        attend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.attend_event_button:
                String url = String
                        .format("http://maps.google.com/maps?saddr=270+Park+Avenue+Manhattan&daddr=%s",
                                address);
                Uri uri = Uri.parse(url + 15);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
