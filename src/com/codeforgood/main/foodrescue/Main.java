package com.codeforgood.main.foodrescue;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.codeforgood.main.foodrescue.fragments.FragmentLogin;
import com.codeforgood.main.foodrescue.user.User;

public class Main extends ActionBarActivity implements OnClickListener {

    User mSelf;
    Button loginPage;
    Button signUp;
    View view;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bruhhh i'm cheating
        context = getApplicationContext();
        view = getWindow().getDecorView().findViewById(android.R.id.content);
        initButtons();
        findButtons();
        setListeners();
    }

    private void initButtons() {
        loginPage = new Button(context);
        signUp = new Button(context);
    }

    private void findButtons() {
        loginPage = (Button) findViewById(R.id.login);
        signUp = (Button) findViewById(R.id.sign_up);
    }

    private void setListeners() {
        loginPage.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent action = null;
        switch (v.getId()) {
            case R.id.login:
                action = new Intent(v.getContext().getApplicationContext(),
                        FragmentLogin.class);
                break;
            case R.id.sign_up:
                break;
            default:
                break;
        }
        if (action != null) {
            startActivity(action);
        }
    }
}
