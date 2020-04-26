package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view)
    {
        counter++;
        TextView textView = (TextView) findViewById(R.id.counter_number);
        String counterRepresentant = String.valueOf(counter);
        textView.setText(counterRepresentant);
    }

    public void decrement(View view)
    {
        counter--;
        TextView textView = (TextView) findViewById(R.id.counter_number);
        String counterRepresentant = String.valueOf(counter);
        textView.setText(counterRepresentant);
    }

    public void setZero(View view)
    {
        counter = 0;
        TextView textView = (TextView) findViewById(R.id.counter_number);
        String counterRepresentant = String.valueOf(counter);
        textView.setText(counterRepresentant);
    }

    public void enableUserInsert(View view)
    {

    }
}
