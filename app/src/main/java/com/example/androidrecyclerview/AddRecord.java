package com.example.androidrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.androidrecyclerview.databinding.ActivityAddRecordBinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class AddRecord extends AppCompatActivity {

    ActivityAddRecordBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_add_record);


/*
        EditText name = findViewById(R.id.name);
        EditText address =  findViewById(R.id.address);
        Button submit =  findViewById(R.id.submit);*/

    }


    public void submitRecord(View view) {

        Intent intent = new Intent();
        intent.putExtra("name", bi.name.getText().toString());
        //intent.putExtra("address", bi.address.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }

    public void cancelRecord(View view) {
        Intent intent = new Intent();
        setResult(RESULT_CANCELED, intent);
        finish();
    }
}