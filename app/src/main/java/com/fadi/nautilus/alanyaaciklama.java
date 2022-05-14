package com.fadi.nautilus;

import static com.fadi.nautilus.R.id.kalplibut;
import static com.fadi.nautilus.R.id.paylas;
import static com.fadi.nautilus.R.id.profil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class alanyaaciklama extends AppCompatActivity {
    private ImageButton  button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alanyaaciklama);
        button1 = findViewById(kalplibut);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(alanyaaciklama.this,fovari.class);
                startActivity(intent);
            }
        });

    }
}