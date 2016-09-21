package com.example.victo.lab1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Modifier;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        textViewEmail = (TextView)findViewById(R.id.textViewEmail);
        SharedPreferences preferences = getSharedPreferences(SETTINGS, MODE_PRIVATE);
        emailStored = preferences.getString(EMAILSTOREDSETTING, emailStored);
        textViewEmail.setText(R.string.email_stored);


        Log.i(ACTIVITY_NAME,"In onCreate()");
    }

    protected void onResume() {
        super.onResume();
        Log.i(ACTIVITY_NAME,"In onResume()");

    }

    protected void onStart() {
        super.onStart();
        Log.i(ACTIVITY_NAME,"In onStart()");
    }

    protected void onPause() {
        super.onPause();
        Log.i(ACTIVITY_NAME,"In onPause()");
    }

    protected void onStop() {
        super.onStop();
        Log.i(ACTIVITY_NAME,"In onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(ACTIVITY_NAME,"In onDestroy()");
    }

    protected static final String ACTIVITY_NAME = "LoginActivity";
    private static final String SETTINGS = "com.example.victo.lab1.user_input";
    private static final String EMAILSTOREDSETTING = "com.example.victo.lab1.email_stored";
    private Button buttonLogin = (Button)findViewById(R.id.buttonLogin);
    private String emailStored = "Stored Email from LoginActivity.java";
    private TextView textViewEmail;


}
