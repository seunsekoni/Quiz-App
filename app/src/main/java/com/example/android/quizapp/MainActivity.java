package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void takeQuiz(View view) {
        // Do something in response to button

        Intent nameIntent = new Intent(MainActivity.this, QuizActivity.class);
        EditText editText = (EditText) findViewById(R.id.name_field);
        String userName = editText.getText().toString();
        nameIntent.putExtra("EditTextValue", userName);
        if (nameIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(nameIntent);
        }
    }


}
