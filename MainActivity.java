package com.example.finalprojectdraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = findViewById(R.id.relativeLayout);
        relativeLayout.setBackgroundColor(Color.YELLOW);

        final RadioGroup radioGroup = findViewById(R.id.radioGroup);
        final TextView textView = findViewById(R.id.text_view_selected);

        Button buttonNext = (Button) findViewById(R.id. button_next);
        Button buttonApply = findViewById(R.id.button_apply);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Next4.class);
                startActivity(intent);
            }
        });
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                textView.setText("Number of players: " + radioButton.getText());

            }
        });
    }

        public void checkButton (View v){
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);

            Toast.makeText(this , radioButton.getText() + " players were selected ", Toast.LENGTH_SHORT).show();
        }





}