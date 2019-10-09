package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScreenTwo extends AppCompatActivity {

    Button Bn;

    Button nextScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);

        this.nextScreen = (Button) findViewById(R.id.activity_main_button_warp_screen_3);

        nextScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //Make intent
                Intent a = new Intent(ScreenTwo.this, ScreenThree.class);
                //Start Intent
                startActivity(a);
            }
        });
    }
}
