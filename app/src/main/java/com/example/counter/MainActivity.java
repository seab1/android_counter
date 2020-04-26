package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int USER_VALUE_REQUEST_CODE = 0;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view)
    {
        counter++;
        TextView textView = (TextView) findViewById(R.id.viewed_number);
        String counterRepresentant = String.valueOf(counter);
        textView.setText(counterRepresentant);
    }

    public void decrement(View view)
    {
        counter--;
        TextView textView = (TextView) findViewById(R.id.viewed_number);
        String counterRepresentant = String.valueOf(counter);
        textView.setText(counterRepresentant);
    }

    public void setZero(View view)
    {
        counter = 0;
        TextView textView = (TextView) findViewById(R.id.viewed_number);
        String counterRepresentant = String.valueOf(counter);
        textView.setText(counterRepresentant);
    }

    public void enableUserInsert(View view)
    {
        Intent intent = new Intent(this, UserValueInsertion.class);
        startActivityForResult(intent, USER_VALUE_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == USER_VALUE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {

                String userValue = data.getStringExtra("user_value");
                this.counter = Integer.parseInt(userValue);

                TextView textView = (TextView) findViewById(R.id.viewed_number);
                textView.setText(userValue);
            }
        }
    }
}
