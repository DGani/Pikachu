package com.example.myapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Web_browser extends AppCompatActivity implements View.OnClickListener {

    Button btnbackweb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);
        btnbackweb = (Button) findViewById(R.id.btnbackweb);
        btnbackweb.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Google(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.ru")));
    }
}
