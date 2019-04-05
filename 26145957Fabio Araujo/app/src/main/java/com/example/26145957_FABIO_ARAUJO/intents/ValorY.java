package com.example.a26145965.intents;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ValorY extends AppCompatActivity {
    private TextInputEditText valor;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valor_y);
        valor = findViewById(R.id.inpValor);
        resultado = findViewById(R.id.Resul);
    }

    public void calcularValor(View v) {
        double valorX = Double.parseDouble(valor.getText().toString());
        double res = 8/ (2 - valorX);
        String texto = "O valor de Y é  : " + res;
        resultado.setText(texto);
    }
}