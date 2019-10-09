package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity<butNext> extends AppCompatActivity {

        Button bN;

        Button regBut;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            this.regBut = (Button) findViewById(R.id.activity_main_button_warp_screen_2);

            regBut.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // создаем intent
                    Intent a = new Intent(MainActivity.this, ScreenTwo.class);
                    // передаем ему данные
                    a.putExtra("loginType", "register");
                    // запускаем интент
                    startActivity(a);
                }
            });
        }
    }
