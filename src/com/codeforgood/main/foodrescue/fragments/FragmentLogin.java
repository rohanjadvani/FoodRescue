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
import android.widget.EditText;

import com.codeforgood.main.foodrescue.R;

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
                showNextFragment();
                break;
            case R.id.sign_up:
                signUpFragment();
                break;
            default:
                break;
        }
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
    }

}
