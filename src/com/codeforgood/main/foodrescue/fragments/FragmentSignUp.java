package com.codeforgood.main.foodrescue.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.codeforgood.main.foodrescue.R;

/**
 * Sign up fragment.
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentSignUp extends Fragment implements OnClickListener {

    Context mContext;
    RadioButton volunteer;
    RadioButton restaurant;
    RadioButton charity;
    TextView username;
    TextView password;
    TextView firstText;
    TextView secondText;
    EditText firstEdit;
    EditText secondEdit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.fragment_signup, container, false);
        mContext = getActivity().getApplicationContext();
        initButtons();
        findButtons(view);
        setListeners();
        return view;
    }

    private void initButtons() {
        volunteer = new RadioButton(mContext);
        restaurant = new RadioButton(mContext);
        charity = new RadioButton(mContext);
        firstText = new TextView(mContext);
        secondText = new TextView(mContext);
        firstEdit = new EditText(mContext);
        secondEdit = new EditText(mContext);
        username = new TextView(mContext);
        password = new TextView(mContext);
    }

    private void findButtons(View view) {
        volunteer = (RadioButton) view.findViewById(R.id.button_volunteer);
        restaurant = (RadioButton) view.findViewById(R.id.button_restaurant);
        charity = (RadioButton) view.findViewById(R.id.button_charity);
        firstText = (TextView) view.findViewById(R.id.first_name_text);
        secondText = (TextView) view.findViewById(R.id.last_name_text);
        firstEdit = (EditText) view.findViewById(R.id.first_name_edit);
        secondEdit = (EditText) view.findViewById(R.id.last_name_edit);
        username = (TextView) view.findViewById(R.id.username_text);
        password = (TextView) view.findViewById(R.id.password_text);
    }

    private void setListeners() {
        volunteer.setOnClickListener(this);
        restaurant.setOnClickListener(this);
        charity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_volunteer:
                firstText.setText("First name");
                firstEdit.setHint("First name");
                secondText.setText("Last name");
                secondEdit.setHint("Last name");
                break;
            case R.id.button_restaurant:
                firstText.setText("Restaurant name");
                firstEdit.setHint("Name");
                secondText.setText("Restaurant location");
                secondEdit.setHint("Location");
                break;
            case R.id.button_charity:
                firstText.setText("Charity name");
                firstEdit.setHint("Name");
                secondText.setText("Charity location");
                secondEdit.setHint("Location");
                break;
        }
    }

}
