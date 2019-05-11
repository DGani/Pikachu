package com.example.myapp;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Animation extends AppCompatActivity implements View.OnClickListener {
    Button btnbackanim;
    TextView tv;
    android.view.animation.Animation anim = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
       btnbackanim = (Button) findViewById(R.id.btnbackanim);
       btnbackanim.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.tv);
        anim = AnimationUtils.loadAnimation(this,R.anim.combo);
        tv.startAnimation(anim);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
