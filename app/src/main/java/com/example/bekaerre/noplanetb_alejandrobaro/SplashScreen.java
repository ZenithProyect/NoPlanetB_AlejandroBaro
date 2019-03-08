package com.example.bekaerre.noplanetb_alejandrobaro;

import android.content.Intent;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        LinearLayout splash = (LinearLayout)findViewById(R.id.linearSplash);

        TextView titulo = (TextView)findViewById(R.id.tvInicio);
        TextView frase = (TextView)findViewById(R.id.tvFrase);
       /* ImageView logo = (ImageView)findViewById(R.id.useLogo);*/

        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.shake);

        splash.startAnimation(animacion);
        openApp(true);

        CircularImageView circularImageView = (CircularImageView)findViewById(R.id.useLogo);


    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen
                        .this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 6000);
    }


    }

