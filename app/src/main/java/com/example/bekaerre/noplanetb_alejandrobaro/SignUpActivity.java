package com.example.bekaerre.noplanetb_alejandrobaro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    protected Button btnCancel;
    protected Button btnSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        //boton cancel y login
        //si damos a cancel volvemos atras.
        //si damos login vamos al mainActivity, no necesita usuario ni contraseña.

        btnCancel = (Button)findViewById(R.id.btnCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
        btnSign = (Button)findViewById(R.id.btnEmail);
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(i);

            }
        });



    }
}
