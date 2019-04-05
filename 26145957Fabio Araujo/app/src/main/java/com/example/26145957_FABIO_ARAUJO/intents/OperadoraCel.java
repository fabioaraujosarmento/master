package com.example.a26145965.intents;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class OperadoraCel extends AppCompatActivity {

    private RadioGroup rdg;
    private TextInputEditText minutosChamada;
    private Button botao;
    private TextView txtResultado;
    double resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadora_cel);
        rdg = findViewById(R.id.opGrupo);
        minutosChamada = findViewById(R.id.minutos);
        botao = findViewById(R.id.calcOp);
        txtResultado = findViewById(R.id.resul);
    }

    public void calcularValor (View v){
        String minutos = minutosChamada.getText().toString();
        double min = Double.parseDouble(minutos);
        if (rdg.getCheckedRadioButtonId() == R.id.tim){
            resultado = ((min * 60) * 0.020 - 0.1);
        }else if (rdg.getCheckedRadioButtonId() == R.id.vivo){
            resultado = ((min * 60) * 0.025 - 0.125);
        }else{
            resultado = ((min * 60) * 0.019 - 0.095);
        }
        txtResultado.setText("Total da ligação R$: " + resultado);
    }

}

