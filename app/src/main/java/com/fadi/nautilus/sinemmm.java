package com.fadi.nautilus;

import static com.fadi.nautilus.R.id.ak;
import static com.fadi.nautilus.R.id.antalyabir;
import static com.fadi.nautilus.R.id.fovariler;
import static com.fadi.nautilus.R.id.harita;
import static com.fadi.nautilus.R.id.paylas;
import static com.fadi.nautilus.R.id.profil;
import static com.fadi.nautilus.R.id.pusula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sinemmm extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinemmm);
        button1=findViewById(antalyabir);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(sinemmm.this,akdenizalanya.class);
            startActivity(intent);
        }
    });
}}