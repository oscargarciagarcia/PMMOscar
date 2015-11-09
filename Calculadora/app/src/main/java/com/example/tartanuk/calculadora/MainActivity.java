package com.example.tartanuk.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variables
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        final EditText numero1 = (EditText) findViewById(R.id.numero1);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        final EditText numero2 = (EditText) findViewById(R.id.numero2);
        final RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        final Button botonResultado = (Button) findViewById(R.id.botonRsultado);
        final Button botonBorrar = (Button) findViewById(R.id.botonBorrar);
        final TextView texView3 = (TextView) findViewById(R.id.textView3);

        //Metodo para cuando haga click en el boton del igual (=)
        botonResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //variable para el resultado (resultadoFinal)
                double resultadoFinal = 0;
                double numero1final = Double.parseDouble(numero1.getText().toString());
                double numero2final = Double.parseDouble(numero2.getText().toString());

                //condiciones para cuando selecciono una operacion (radio group / radio button)
                if (radioGroup1.getCheckedRadioButtonId() == R.id.suma) {
                    resultadoFinal = numero1final + numero2final;
                }

                if (radioGroup1.getCheckedRadioButtonId() == R.id.resta) {
                    resultadoFinal = numero1final - numero2final;
                }

                if (radioGroup1.getCheckedRadioButtonId() == R.id.multiplicacion) {
                    resultadoFinal = numero1final * numero2final;
                }

                if (radioGroup1.getCheckedRadioButtonId() == R.id.division) {
                    resultadoFinal = numero1final / numero2final;
                }

                texView3.setText ("El resultado de la operacion es: " + resultadoFinal);
            }
        });

        //Metodo para cuando haga click en el boton del borrar
        botonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //limpiar el edit text del numero1
                numero1.setText("");

                //limpiar el edit text del numero2
                numero2.setText("");

                //limpio el radioButton, lo dejo limpio para seleccionar otra operacion
                radioGroup1.clearCheck();

                //creamos una variable nueva para que el resultado aparezca como 0
                double resultadoFinal2 = 0;
                //limpiar el resultado que muestra para que sea 0
                texView3.setText ("El resultado de la operacion es: " + resultadoFinal2);

            }
        });
    }
}






