package com.comunicacionactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtTextNom;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTextNom = (EditText) findViewById(R.id.edtTextNom);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                enviarInfoActivity();
            }
        });

    }

    private void enviarInfoActivity() {

        Intent intent = new Intent(this, Main2Activity.class);

        intent.putExtra("usuario", edtTextNom.getText().toString());

        startActivity(intent);

    }
}
