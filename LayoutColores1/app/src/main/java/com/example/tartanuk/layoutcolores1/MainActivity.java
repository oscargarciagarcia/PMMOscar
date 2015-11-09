package com.example.tartanuk.layoutcolores1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tartanuk.layoutcolores1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables
        final ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        final ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        final ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        final Button button1 = (Button) findViewById(R.id.button1);
        final TextView textView1 = (TextView) findViewById(R.id.textview1);


        imageButton1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                textView1.setBackgroundColor(Color.RED);

            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView1.setBackgroundColor(Color.GREEN);

            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView1.setBackgroundColor(Color.BLUE);

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView1.setBackgroundColor(Color.TRANSPARENT);

            }
        });





    }





}
