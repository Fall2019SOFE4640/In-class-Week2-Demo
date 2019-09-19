/*
Author: Anwar Abdalbari
Date: Dec. 17, 2019
Purpose: Interface layouts
 */
package com.example.sofe4640.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    //The entry point to my app.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This method is used to handel linear layout activity
    public void callLinearLayout(View v){
        setContentView(R.layout.linear_layout);
        Spinner spinner = findViewById(R.id.spinnerId);
       //Array myArray = findViewById(R.array.countries) ;
        fillSpinner((Spinner) spinner);

    }

    //This method is used to handel Gridview layout activity
    public void callGridViewLayout(View v){
        setContentView(R.layout.grid_layout);

    }

    //This method is used to fil a sinner with array's data
    private void fillSpinner(Spinner spinner) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.countries,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         spinner.setAdapter(adapter);
    }

    //This method is used to navigate back to the main activity
    public void backToMain(View v){
        setContentView(R.layout.activity_main);
    }

    //This method is used to handel the relative layout activity
    public void callRelativeLayout(View v){
        setContentView(R.layout.relative_layout);

    }
}
