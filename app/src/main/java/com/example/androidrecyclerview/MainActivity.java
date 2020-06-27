package com.example.androidrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton addData;
    RecyclerView programmingList;
    ProgrammingAdapter pAdapter;
    ArrayList students = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        programmingList = findViewById(R.id.programmingList);
        programmingList.setLayoutManager(new LinearLayoutManager(this));

        students.add("Hussain");
        students.add("Azhar");
        students.add("Ahsan");

        pAdapter = new ProgrammingAdapter(students);

        programmingList.setAdapter(pAdapter);

        addData = findViewById(R.id.addData);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity.this, AddRecord.class), 1);

            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Toast.makeText(this, "Results", Toast.LENGTH_SHORT).show();
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                //String address = data.getStringExtra("address");
                students.add(name);
                pAdapter.notifyDataSetChanged();

            }
            if (resultCode == RESULT_CANCELED) {
                Toast.makeText(this, "Operation was Cancelled", Toast.LENGTH_SHORT).show();

            }

        }
    }

}