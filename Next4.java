package com.example.finalprojectdraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RelativeLayout;

public class Next4 extends AppCompatActivity {
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next4);
        relativeLayout = findViewById(R.id.relativeLayout1);
        relativeLayout.setBackgroundColor(Color.CYAN);

        final EditText player1 = findViewById(R.id.player1);
        final EditText player2 = findViewById(R.id.player2);
        final EditText player3 = findViewById(R.id.player3);
        final EditText player4 = findViewById(R.id.player4);
        Button buttonNext = (Button) findViewById(R.id. button_next);
        Button buttonBack = (Button) findViewById(R.id. back_4);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Next4.this, MainActivity.class);
                startActivity(intent);

            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Next4.this, Bottle4.class);
                intent.putExtra("first", player1.getText().toString());
                intent.putExtra("second", player2.getText().toString());
                intent.putExtra("third", player3.getText().toString());
                intent.putExtra("fourth", player4.getText().toString());
                startActivity(intent);
            }
        });


    }
}


17th commit
18th commit
19th commit
20th commit
21st commit
22nd commit
23rd commit
24th commit
25th commit
26th commit
27th commit
28th commit
