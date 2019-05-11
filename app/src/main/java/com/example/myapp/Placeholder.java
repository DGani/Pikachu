package com.example.myapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;

public class Placeholder extends AppCompatActivity implements View.OnClickListener {
    ConstraintLayout layout;
    Button btnback;
    android.support.constraint.Placeholder placeholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placeholder);
        btnback = (Button) findViewById(R.id.btnback);
        btnback.setOnClickListener(this);
        placeholder =  findViewById(R.id.placeholder);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void swapView(View v){
      //  TransitionManager.beginDelayedTransition(layout);
      placeholder.setContentId(v.getId());
    }
}


