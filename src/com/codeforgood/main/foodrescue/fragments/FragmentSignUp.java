package com.codeforgood.main.foodrescue.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.parse.*;

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
    Button signUp;
    TextView username;
    TextView password;
    TextView firstText;
    TextView secondText;
    EditText firstEdit;
    EditText secondEdit;
    EditText emailEdit;
    EditText phoneEdit;
    EditText usernameEdit;
    EditText passwordEdit;
    TextView email;
    TextView phone;

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
        signUp = new Button(mContext);
        firstText = new TextView(mContext);
        secondText = new TextView(mContext);
        firstEdit = new EditText(mContext);
        secondEdit = new EditText(mContext);
        phoneEdit = new EditText(mContext);
        usernameEdit = new EditText(mContext);
        passwordEdit = new EditText(mContext);
        emailEdit = new EditText(mContext);
        username = new TextView(mContext);
        password = new TextView(mContext);
    }

    private void findButtons(View view) {
        volunteer = (RadioButton) view.findViewById(R.id.button_volunteer);
        restaurant = (RadioButton) view.findViewById(R.id.button_restaurant);
        charity = (RadioButton) view.findViewById(R.id.button_charity);
        signUp = (Button) view.findViewById(R.id.sign_up_button);
        firstText = (TextView) view.findViewById(R.id.first_name_text);
        secondText = (TextView) view.findViewById(R.id.last_name_text);
        firstEdit = (EditText) view.findViewById(R.id.first_name_edit);
        secondEdit = (EditText) view.findViewById(R.id.last_name_edit);
        phoneEdit = (EditText) view.findViewById(R.id.phone_edit);
        usernameEdit = (EditText) view.findViewById(R.id.username_edit);
        passwordEdit = (EditText) view.findViewById(R.id.password_edit);
        emailEdit = (EditText) view.findViewById(R.id.email_edit);
        username = (TextView) view.findViewById(R.id.username_text);
        password = (TextView) view.findViewById(R.id.password_text);
        email = (TextView) view.findViewById(R.id.email_text);
        phone = (TextView) view.findViewById(R.id.phone_text);
    }

    private void setListeners() {
        volunteer.setOnClickListener(this);
        restaurant.setOnClickListener(this);
        charity.setOnClickListener(this);
        signUp.setOnClickListener(this);
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
            case R.id.sign_up_button:
                sendUserInfoToParse();
                break;
        }
    }

    private void sendUserInfoToParse() {
        ParseUser user = new ParseUser();
        user.setUsername(usernameEdit.getText().toString());
        user.setPassword(passwordEdit.getText().toString());
        user.put("firstValue", firstEdit.getText().toString());
        user.put("secondValue", secondEdit.getText().toString());
        user.put("email", emailEdit.getText().toString());
        user.put("phone", phoneEdit.getText().toString());

        if (volunteer.isChecked()) {
            user.put("typeOfUser", "Volunteer");
        }
        if (restaurant.isChecked()) {
            user.put("typeOfUser", "Restaurant");
        }
        if (charity.isChecked()) {
            user.put("typeOfUser", "Charity");
        }

        user.signUpInBackground(new SignUpCallback() {

            public void done(ParseException e) {
                if (e == null) {
                    // Hooray! Let them use the app now.
                    System.out.println("Succeeded!");
                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                    System.out.println("Failed");
                }
            }
        });
    }
}
