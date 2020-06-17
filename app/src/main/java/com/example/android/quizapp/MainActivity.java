package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View v) {
        EditText editTextName = (EditText) findViewById(R.id.name);
        String name = editTextName.getText().toString();


        EditText editText1 = (EditText) findViewById(R.id.Q1);
        EditText editText2 = (EditText) findViewById(R.id.Q2);
        EditText editText3 = (EditText) findViewById(R.id.Q6);

        String Answer1 = editText1.getText().toString().trim();
        String Answer2 = editText2.getText().toString().trim();
        String Answer6 = editText3.getText().toString().trim();

        RadioButton radioView1 = (RadioButton) findViewById(R.id.messi);
        RadioButton radioView2 = (RadioButton) findViewById(R.id.messi2);
        RadioButton radioView3 = (RadioButton) findViewById(R.id.messi3);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.brazil);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.germany);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.saudi);


        Boolean Answer3 = radioView1.isChecked();
        Boolean Answer4 = radioView2.isChecked();
        Boolean Answer5 = radioView3.isChecked();
        Boolean Answer7 = checkBox1.isChecked();
        Boolean Answer8 = checkBox2.isChecked();
        Boolean Answer9 = checkBox3.isChecked();


        if (Answer1.equalsIgnoreCase(getString(R.string.ans1)))
            score++;
        if (Answer2.equalsIgnoreCase(getString(R.string.ans2)))
            score++;
        if (Answer6.equalsIgnoreCase(getString(R.string.ans6)))
            score++;
        if (Answer3)
            score++;
        if (Answer4)
            score++;
        if (Answer5)
            score++;
        if (Answer7 && Answer8 && !Answer9)
            score++;

        if (score == 7)
            displayScore(name + ", Your Score is: " + score + " out of 7, Perfect!");
        else if (score > 4 && score < 7)
            displayScore(name + ", Your Score is: " + score + " out of 7, Great!");
        else if (score == 0)
            displayScore(name + ", Your Score is: " + score + " out of 7, Bad!");
        else
            displayScore(name + ", Your Score is: " + score + " out of 7, not Bad!");

        score = 0;

    }

    public void displayScore(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }


}
