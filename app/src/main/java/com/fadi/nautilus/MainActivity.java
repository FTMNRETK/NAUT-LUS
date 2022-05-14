package com.fadi.nautilus;

import static com.fadi.nautilus.R.id.ak;
import static com.fadi.nautilus.R.id.fovariler;
import static com.fadi.nautilus.R.id.harita;
import static com.fadi.nautilus.R.id.paylas;
import static com.fadi.nautilus.R.id.profil;
import static com.fadi.nautilus.R.id.pusula1;
import static com.fadi.nautilus.R.layout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;
    private ImageButton button5;
    private ImageButton button6;



    @Override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(layout.activity_main);

        button1=findViewById(paylas);
        button2=findViewById(profil);
        button3=findViewById(pusula1);
        button4=findViewById(harita);
        button5=findViewById(ak);
        button6=findViewById(fovariler);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,paylas_sayfasi.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,profil.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,navigasyon.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,sinemmm.class);
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,fovari.class);
                startActivity(intent);
            }
        });






    }
}



