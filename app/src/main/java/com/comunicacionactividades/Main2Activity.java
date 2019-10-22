package com.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView tvPregunta;
    private Button btnAceptar;
    private Button btnRechazar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvPregunta = findViewById(R.id.tvPregunta);
        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("usuario");
        tvPregunta.setText("Hola " + nombre + ", ¿Aceptas las condiciones?");

        button = (Button) findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                enviarInfoActivity();
            }
        });

    }

    public void enviarInfoActivity() {

    }

}
