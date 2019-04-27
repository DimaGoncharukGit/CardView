package com.example.magazine;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.imageView);

        imageView = findViewById(R.id.imageView);

        Animation animationload = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.load_animation);
        imageView.startAnimation(animationload);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Home.class);
                startActivity(intent);
            }
        }, 2000);
    }
}





