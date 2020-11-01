package com.example.mydb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondpage extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        button = (Button) findViewById(R.id.button2);
        button2 = (Button) findViewById(R.id.button3);
        button3 = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoWorkList();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoWorkList2();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                gotoWorkList3();
            }
        });

    }

    public void gotoWorkList() {

        Intent intent = new Intent(this, worklist.class);
        startActivity(intent);

    }

    public void gotoWorkList2() {

        Intent intent = new Intent(this, worklist2.class);
        startActivity(intent);
    }

    public void gotoWorkList3() {

        Intent intent = new Intent(this, worklist3.class);
        startActivity(intent);
    }
}