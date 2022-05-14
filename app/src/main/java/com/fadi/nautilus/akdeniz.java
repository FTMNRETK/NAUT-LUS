package com.fadi.nautilus;

import static com.fadi.nautilus.R.id.antalyabir;
import static com.fadi.nautilus.R.id.paylas;
import static com.fadi.nautilus.R.id.profil;
import static com.fadi.nautilus.R.id.pusula1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class akdeniz extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akdeniz);

        button1 = findViewById(paylas);
        button2 = findViewById(profil);
        button3 = findViewById(pusula1);
        button4= findViewById(antalyabir);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(akdeniz.this,paylas_sayfasi.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(akdeniz.this, profil.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(akdeniz.this, navigasyon.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent intent = new Intent(akdeniz.this, akdenizalanya.class);
                startActivity(intent);
            }
        });

}
}