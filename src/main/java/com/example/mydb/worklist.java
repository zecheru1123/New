package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class worklist extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worklist);

        button = (Button) findViewById(R.id.button5);
        button2 = (Button) findViewById(R.id.button6);
        button3 = (Button) findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoWorkout();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoWorkout2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoWorkout3();
            }
        });

    }

    public void gotoWorkout() {

        Intent intent = new Intent(this, workout1.class);
        startActivity(intent);

    }

    public void gotoWorkout2() {

        Intent intent = new Intent(this, workout2.class);
        startActivity(intent);

    }

    public void gotoWorkout3() {

        Intent intent = new Intent(this, workout3.class);
        startActivity(intent);

    }
}