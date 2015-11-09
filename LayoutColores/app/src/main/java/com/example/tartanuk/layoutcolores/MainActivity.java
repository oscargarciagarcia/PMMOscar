package com.example.tartanuk.layoutcolores;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crea una variable, la busca per la id
        final TextView textView1 = (TextView) findViewById(R.id.textview1);
        final RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        final Button button1 = (Button) findViewById(R.id.button1);
        final Button button2 = (Button) findViewById(R.id.button2);
        //limpia los radio buton cada vez que entro
        radioGroup1.clearCheck();

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                if (radioGroup1.getCheckedRadioButtonId() == R.id.radioButton1) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "toast de prueba rojo", Toast.LENGTH_SHORT);
                    toast1.show();
                    //textView2.setBackgroundColor(Color.RED);
                    textView1.setBackgroundColor(Color.RED);
                } else if (radioGroup1.getCheckedRadioButtonId() == R.id.radioButton2) {
                    Toast toast2 = Toast.makeText(getApplicationContext(), "toast de prueba verde", Toast.LENGTH_SHORT);
                    toast2.show();
                    textView1.setBackgroundColor(Color.GREEN);
                } else {
                    Toast toast3 = Toast.makeText(getApplicationContext(), "toast de prueba azul", Toast.LENGTH_SHORT);
                    toast3.show();
                    textView1.setBackgroundColor(Color.BLUE);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                textView1.setBackgroundColor(Color.TRANSPARENT);

            }
        });





    }





}
