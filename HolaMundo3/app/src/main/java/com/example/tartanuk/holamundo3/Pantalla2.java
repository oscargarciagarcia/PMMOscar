package com.example.tartanuk.holamundo3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tartanuk on 5/10/15.
 */
public class Pantalla2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView otroSaludo= (TextView)findViewById(R.id.miMensaje);
        final ImageButton BtnImage= (ImageButton)findViewById(R.id.BtnImage);
        final ImageButton BtnImage2= (ImageButton)findViewById(R.id.BtnImage2);
        Bundle  miBundleRecoger = getIntent().getExtras();
        otroSaludo.setText(miBundleRecoger.getString("TEXTO"));
        final String completarSaludo=miBundleRecoger.getString("TEXTO");
        BtnImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent vueltaIntent = new Intent();
                Bundle vueltaBundle = new Bundle();
                //    String mensajeDevuelto = "Hemos vuelto a la pantalla principal " + completarSaludo;
                String mensajeDevuelto = "Hemos vuelto a la pantalla principal " + completarSaludo;
                vueltaBundle.putString("DEVUELTO", mensajeDevuelto);
                vueltaIntent.putExtras(vueltaBundle);
                setResult(RESULT_OK, vueltaIntent);
                finish();

            }

        });


    }

    /*BtnImage2.setOnClickListener(new View.OnClickListener()) {
        public void onClick(View v) {
            if (miMusica.isPlaying()) {
                miMusica.pause();
            }else {
                miMusica.start();
            }
        }
    }*/

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

