package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserValueInsertion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_value_insertion);
    }

    public void sendValue(View view)
    {
        EditText editText = (EditText) findViewById(R.id.value_field);
        String userValue = editText.getText().toString();
        Intent intent = new Intent();

        try
        {
            userValue = String.valueOf(Integer.parseInt(userValue));
            intent.putExtra("user_value", userValue);
            setResult(RESULT_OK, intent);
            finish();
        }
        catch(Exception e)
        {
            intent.putExtra("user_value", "0");
            setResult(RESULT_OK, intent);
            finish();
        }
    }
}
