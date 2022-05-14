package com.fadi.nautilus;

import static com.fadi.nautilus.R.id.ak;
import static com.fadi.nautilus.R.id.imge;
import static com.fadi.nautilus.R.id.paylas;
import static com.fadi.nautilus.R.id.profil;
import static com.fadi.nautilus.R.id.pusula1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class akdenizalanya extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akdenizalanya);
        ListView listView=findViewById(R.id.listeview);
        List<String> list=new ArrayList<>();
        list.add("ALANYA");
        list.add("KAŞ");
        list.add("KEMER");
        list.add("BELEK");
        list.add("KALKAN");
        list.add("KALEİÇİ");
        list.add("ADRASAN");
        list.add("DEMRE");
        list.add("OLİMPOS");
        list.add("BATIK ŞEHİR");
        list.add("TEKİROVA");
        list.add("LİKYA YOLU");
        list.add("ÇIRALI");
        list.add("ALANYA KALESİ");
        list.add("DÜDEN ŞELALESİ");



        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0) {
                    //clicked apple
                    startActivity(new Intent(akdenizalanya.this,alanyaaciklama.class));
                } else if (i == 1) {
                    //clicked k
                } else {
                }
            }
        });
        }
    }