package com.example.myapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myapp.R.color.colorAccent;

public class MainActivity extends AppCompatActivity {

    TextView tvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tvColor = (TextView) findViewById(R.id.tvColor);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.image1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       //getMenuInflater().inflate(R.menu.menu_list, menu);
        menu.add(0, 1, 0, "Placeholder");
        menu.add(0, 2, 1, "Web browser");
        menu.add(0, 3, 2, "Animation");
        menu.add(1, 4, 3, "exit");
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent intent_plh = new Intent(this, Placeholder.class);
                startActivity(intent_plh);
                Toast.makeText(this, "Placeholder", Toast.LENGTH_LONG).show();
                break;
            case 2:
                Intent intent_web = new Intent(this, Web_browser.class);
                startActivity(intent_web);
                Toast.makeText(this, "Web-browser", Toast.LENGTH_LONG).show();
                break;
            case 3:
                Intent intent_anim = new Intent(this, Animation.class);
                startActivity(intent_anim);
                Toast.makeText(this, "Animation", Toast.LENGTH_LONG).show();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                break;
        }
        ;
        return super.onOptionsItemSelected(item);
    }

}