package com.lcardoso.formulriodenovousurio;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    Spinner school, state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        school = (Spinner)findViewById(R.id.school);

        ArrayAdapter adapter =  ArrayAdapter.createFromResource(this,
                        R.array.school, android.R.layout.simple_spinner_item);
        school.setAdapter(adapter);

        state = (Spinner)findViewById(R.id.state);

        ArrayAdapter adapterState = ArrayAdapter.createFromResource(this,
                            R.array.state, android.R.layout.simple_spinner_item);
        state.setAdapter(adapterState);

        ArrayAdapter  adapterStyle = ArrayAdapter.createFromResource(this, R.array.state, R.layout.spinner_item);
        state.setAdapter(adapterStyle);
        ArrayAdapter  adapterStyle1 = ArrayAdapter.createFromResource(this, R.array.school, R.layout.spinner_item);
        school.setAdapter(adapterStyle1);
    }
}
