package com.example.androidrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));
        String[] students = {"Hussain", "Azhar", "Ahsan", "Hamza", "Amir", "Haseeb", "Najeeb", "Hussain", "Azhar", "Ahsan", "Hamza", "Amir", "Haseeb", "Najeeb"};
        programmingList.setAdapter(new ProgrammingAdapter(students));
    }
}