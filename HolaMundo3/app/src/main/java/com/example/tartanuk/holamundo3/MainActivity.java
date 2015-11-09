package com.example.tartanuk.holamundo3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static int COD_RESPUESTA=0;
    TextView elSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        MediaPlayer miMusica = MediaPlayer.create(getApplicationContext(), R.raw.acdc);
        miMusica.start();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText miTexto= (EditText)findViewById(R.id.miTxt);
        final Button miBoton= (Button)findViewById(R.id.miBtn);
        final Button BtnImage2 = (Button)findViewById(R.id.BtnImage2);
        elSaludo= (TextView)findViewById(R.id.miLbl);

        //Si regreso de otra actividad
        if (savedInstanceState!=null){
            String mensajePasado=savedInstanceState.getString("TEXTO");
            elSaludo.setText(mensajePasado);

        }
        //Borrar el texto inicial del EditText
        miTexto.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean b){
                if (b)  miTexto.setText("");

            }
        });

        miBoton.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                Intent miIntent= new Intent(MainActivity.this, Pantalla2.class);
                Bundle miBundle=new Bundle();
                String mensaje= "" +miTexto.getText();
                String mensajePaso= "Com estas " + miTexto.getText();
                miBundle.putString("TEXTO", mensajePaso);
                miIntent.putExtras(miBundle);
                startActivityForResult(miIntent, COD_RESPUESTA);
                //elSaludo.setText(mensajePaso);
            }

        });
    }
    public void onActivityResult(int cod_resp, int cod_result,Intent intent){
        if (cod_result== RESULT_OK) {
            Bundle otroBundle = intent.getExtras();
            elSaludo.setText(otroBundle.getString("DEVUELTO"));
        }
    }

    //ejercicio fotocopia
    protected void showToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
    protected void showAlert (CharSequence text) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage(text);
        alert.setPositiveButton(android.R.string.ok, null);
        alert.show();

    }







    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show();
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }




}
