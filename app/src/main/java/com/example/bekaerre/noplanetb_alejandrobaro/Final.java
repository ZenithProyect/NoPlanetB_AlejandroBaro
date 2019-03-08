package com.example.bekaerre.noplanetb_alejandrobaro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mikhaellopez.circularimageview.CircularImageView;

public class Final extends AppCompatActivity {
    CircularImageView imgLogoPeq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);


        imgLogoPeq = this.<CircularImageView>findViewById(R.id.ivLogoPequ);
    }
}
