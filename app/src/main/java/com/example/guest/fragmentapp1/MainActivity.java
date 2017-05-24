package com.example.guest.fragmentapp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.btnMood) Button btnMood;
    @Bind(R.id.btnLogIn) Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        btnMood.setOnClickListener(this);
        btnLogIn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == btnMood) {
            android.app.FragmentManager fm = getFragmentManager();
            MoodDialogFragment moodDialogFragment = new MoodDialogFragment();
            moodDialogFragment.show(fm, "Sample Fragment");
        } else if (v == btnLogIn) {
            android.app.FragmentManager fm = getFragmentManager();
            LogInDialogFragment logInDialogFragment = new LogInDialogFragment();
            logInDialogFragment.show(fm, "Sample Fragment");
            Log.d("login", "button connected.");
        }
    }
}
