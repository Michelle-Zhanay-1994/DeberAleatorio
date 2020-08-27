package com.example.aletorio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button butnEmpezar;
    private TextView Respuesta;
    private EditText numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butnEmpezar = (Button) findViewById(R.id.buttonempezar);
        butnEmpezar.setOnClickListener(this);
        Respuesta = (TextView) findViewById(R.id.TextViewRespuesta);
        numero = (EditText)findViewById(R.id.editTextNumber);

    }

    @Override
    public void onClick(View v) {
        int num= Integer.valueOf(numero.getText().toString()) ;
        if(butnEmpezar==v){
        for (int i=0;i<=num; i++){
            int random = (int) (Math.random()*num);
            String respuesta = String.valueOf(random);
            Respuesta.setText(respuesta);
        }
        }
    }
}