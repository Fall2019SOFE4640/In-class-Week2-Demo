package com.example.sofe4640.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void callLinearLayout(View v){
        setContentView(R.layout.linear_layout);
        Spinner spinner = findViewById(R.id.spinnerId);
       //Array myArray = findViewById(R.array.countries) ;
        fillSpinner((Spinner) spinner);

    }

    public void callGridViewLayout(View v){
        setContentView(R.layout.grid_layout);

    }
    private void fillSpinner(Spinner spinner) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.countries,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         spinner.setAdapter(adapter);
         //this is Java
        // Car myCar = new Car();
    }

    public void backToMain(View v){
        setContentView(R.layout.activity_main);
    }

    public void callRelativeLayout(View v){
        setContentView(R.layout.relative_layout);

    }
}
