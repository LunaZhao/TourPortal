package com.example.tourportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the title
        getSupportActionBar().setTitle("DAV Karlsruhe TourPortal");


        // open login activity
        Button buttonLogin = findViewById(R.id.button_login);
        /*
        buttonLogin.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v)
                {
                    // todo LoginActivity has to be implementet
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            });
         */



        // open register activity
        Button buttonRegister = findViewById(R.id.button_register);

        buttonRegister.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v)
           {
               // todo RegisterActivity has to be implementet
               Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
               startActivity(intent);
           }
        });




    }

}