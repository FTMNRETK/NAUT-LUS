package com.fadi.nautilus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class fovari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fovari);
        ListView listView=findViewById(R.id.listeview);
        List<String> list=new ArrayList<>();
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");
        list.add("FAVORİLERE EKLENEN YER YOK");


        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
    }
}