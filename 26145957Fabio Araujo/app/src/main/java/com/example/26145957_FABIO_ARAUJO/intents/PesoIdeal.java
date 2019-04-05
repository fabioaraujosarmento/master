package com.example.a26145965.intents;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;

public class PesoIdeal extends AppCompatActivity {

    private TextInputEditText inputAltura;
    private RadioGroup rdGroup;
    private TextView Resul;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_ideal);
        inputAltura = findViewById(R.id.alt);
        rdGroup = findViewById(R.id.rg);
        Resul = findViewById(R.id.txtResultado);
    }

    public void calcularPeso(View v ){
        String altura = inputAltura.getText().toString();
        if (rdGroup.getCheckedRadioButtonId() == R.id.masc){
            resultado = (72.7 * Double.parseDouble(altura)) - 58;
        }else{
            resultado = (62.1 * Double.parseDouble(altura)) - 44.7;
        }

    }

}

