package com.example.androidrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton addData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] students = {"Hussain", "Azhar", "Ahsan"};
        programmingList.setAdapter(new ProgrammingAdapter(students));

        addData = findViewById(R.id.addData);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddRecord.class));
            }
        });
    }
}