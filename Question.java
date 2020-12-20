package com.example.finalprojectdraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Question extends AppCompatActivity {
    private Button show_question;
    private Button show_answer;
    private Button try_again;
    private Button go_to_start;
    private TextView question;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        show_question = (Button) findViewById(R.id.show_question);
        show_answer = (Button) findViewById(R.id.show_answer);
        try_again = (Button) findViewById(R.id.try_again);
        go_to_start = (Button) findViewById(R.id.go_to_start);
        question = (TextView) findViewById(R.id.question);
        answer = (TextView) findViewById(R.id.answer);

        final String[] questions = {"What is the closest capital city to London? ","Which former British colony was given back to China in 1997?", "Which Tolstoy novel begins \"All happy families are alike; each unhappy family is unhappy in its own way.\"","Karl Lagerfeld was head of which fashion house?","What does the \"SD\" in SD card stand for? ","Is the meaning of life the same for animals and humans? "};

        show_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                final int index;
                index = r.nextInt(5);

                question.setText(questions[index]);

            }
        });


        final String[] answers = {"Brussel","Hong Kong","Anna Karenina", "Chanel ", "Secure Digital ", "You are lucky! There's no right answer!"};

        show_answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < answers.length; i ++){
                    if(question.getText().equals(questions[i]))
                    answer.setText(answers[i]);
                }
            }
        });


        try_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question.this, Bottle4.class);
                startActivity(intent);
            }
        });

        go_to_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}