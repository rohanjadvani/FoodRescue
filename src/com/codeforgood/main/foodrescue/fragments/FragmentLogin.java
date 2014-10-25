package com.codeforgood.main.foodrescue.fragments;

import java.util.List;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.codeforgood.main.foodrescue.R;
import com.parse.*;

/**
 * Login fragment
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentLogin extends Fragment implements OnClickListener {

    Context mContext;
    Button login;
    Button signUp;
    EditText userNameEditText;
    EditText passWordEditText;
    boolean validLogin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        mContext = getActivity().getApplicationContext();
        this.validLogin = false;
        initButtons();
        findButtons(view);
        setListeners();
        return view;
    }

    private void initButtons() {
        assert (mContext != null);
        login = new Button(mContext);
        signUp = new Button(mContext);
        userNameEditText = new EditText(mContext);
        passWordEditText = new EditText(mContext);
    }

    private void findButtons(View view) {
        login = (Button) view.findViewById(R.id.login_button);
        signUp = (Button) view.findViewById(R.id.sign_up);
        userNameEditText = (EditText) view.findViewById(R.id.login_username);
        passWordEditText = (EditText) view.findViewById(R.id.login_password);
    }

    private void setListeners() {
        login.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button:
                /*signIntoParse();
                if (validLogin == false) {
                    Toast.makeText(mContext,
                            "Wrong password & username combination",
                            Toast.LENGTH_LONG).show();
                } else {
                    showNextFragment();
                }*/
                showNextFragment();
                break;
            case R.id.sign_up:
                signUpFragment();
                break;
            default:
                break;
        }
    }

    private void signIntoParse() {
        ParseUser.logInInBackground(userNameEditText.getText().toString(),
                passWordEditText.getText().toString(), new LogInCallback() {

                    public void done(ParseUser user, ParseException e) {
                        if (user != null) {
                            validLogin = true;
                            // Hooray! The user is logged in.
                            System.out
                                    .println("User has logged in successfully");
                        } else {
                            // Signup failed. Look at the ParseException to see
                            // what happened
                            validLogin = false;
                        }
                    }
                });
    }

    private void signUpFragment() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, new FragmentSignUp());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    private void volunteerFragment() {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, new FragmentVolunteer());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    private void showNextFragment() {
        volunteerFragment();
        // get type of user
        ParseQuery<ParseObject> query = ParseQuery.getQuery("typeOfUser");
        query.whereEqualTo("typeOfUser", "Volunteer");
        query.findInBackground(new FindCallback<ParseObject>() {

            @Override
            public void done(List<ParseObject> arg0, ParseException arg1) {
                if (arg1 == null) {
                    volunteerFragment();
                }
            }
        });
    }

}
