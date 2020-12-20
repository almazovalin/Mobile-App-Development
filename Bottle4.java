package com.example.finalprojectdraft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.RelativeLayout;

import java.util.Random;

public class Bottle4 extends AppCompatActivity {
    Button b_spin;
    ImageView iv_bottle;
    Button go_to_question;
    //RelativeLayout relativeLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottle4);


        b_spin = (Button) findViewById(R.id.b_spin);
        iv_bottle = (ImageView) findViewById(R.id. iv_spin);
        Button to_start = (Button) findViewById(R.id.to_start_4) ;
        go_to_question = (Button) findViewById(R.id.go_to_question) ;
        //relativeLayout2 = findViewById(R.id.relativeLayout2);
        //relativeLayout2.setBackgroundColor(Color.BLACK);

        Intent intent = getIntent();
        final String txt1 = intent.getStringExtra("first");
        final String txt2 = intent.getStringExtra("second");
        final String txt3 = intent.getStringExtra("third");
        final String txt4 = intent.getStringExtra("fourth");
        to_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bottle4.this, MainActivity.class);
                startActivity(intent);

            }
        });

        go_to_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bottle4.this, Question.class);
                startActivity(intent);

            }
        });

        b_spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final int theSpinDegrees;
                Random r = new Random();
                theSpinDegrees = r.nextInt(3600);

                RotateAnimation rotateBottle = new RotateAnimation(0, theSpinDegrees, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                rotateBottle.setDuration(2000);
                rotateBottle.setFillAfter(true);

                rotateBottle.setInterpolator( new AccelerateDecelerateInterpolator());

                iv_bottle.startAnimation(rotateBottle);

                rotateBottle.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        if (theSpinDegrees % 360 <= 90){
                            Toast.makeText(Bottle4.this, " " + txt1 +  ", please answer the following question:  ", Toast.LENGTH_SHORT).show();
                        }

                        else if (theSpinDegrees % 360 <= 180){
                            Toast.makeText(Bottle4.this, " " + txt2 +  ", please answer the following question:   ", Toast.LENGTH_SHORT).show();
                        }

                        else if (theSpinDegrees % 360 <= 270){
                            Toast.makeText(Bottle4.this, " " + txt3 +  ", please answer the following question:   ", Toast.LENGTH_SHORT).show();
                        }

                        else {
                            Toast.makeText(Bottle4.this, " " + txt4 +  ", please answer the following question:   ", Toast.LENGTH_SHORT).show();
                        }

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });






            }
        });
    }
}