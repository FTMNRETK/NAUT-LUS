package com.fadi.nautilus;

import static com.fadi.nautilus.R.id.antalyabir;
import static com.fadi.nautilus.R.id.kaydolbtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profil extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        button=findViewById(kaydolbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(profil.this,kaydol.class);
                startActivity(intent);
            }
        });
    }
}