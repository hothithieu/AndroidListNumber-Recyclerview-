package com.example.androidrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewList;
    NumberArapter listnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] num = new int[100];

        recyclerViewList = findViewById(R.id.recycler);
        recyclerViewList.setLayoutManager(new LinearLayoutManager(this));

        listnumber = new NumberArapter(this, num);
        recyclerViewList.setAdapter(listnumber);
    }
}