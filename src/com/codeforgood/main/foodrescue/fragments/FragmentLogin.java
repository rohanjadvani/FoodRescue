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
 * Login fragment
 * 
 * @author Rohan Jadvani
 *
 */
public class FragmentLogin extends Fragment implements OnClickListener {

    Context mContext;
    Button login;
    Button signUp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        mContext = getActivity().getApplicationContext();
        initButtons();
        findButtons(view);
        setListeners();
        return view;
    }

    private void initButtons() {
        assert (mContext != null);
        login = new Button(mContext);
        signUp = new Button(mContext);
    }

    private void findButtons(View view) {
        login = (Button) view.findViewById(R.id.login_button);
        signUp = (Button) view.findViewById(R.id.sign_up);
    }

    private void setListeners() {
        login.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button:
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

}
