package com.example.a26145965.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PesoTerra extends AppCompatActivity {

    private Spinner plan;
    private TextInputEditText peso;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_terra);
        plan = findViewById(R.id.plan);
        peso = findViewById(R.id.peso);
        resultado = findViewById(R.id.res);
    }

    public void pesoPlan(View v){
        String esc = plan.getSelectedItem().toString();
        double pes = Double.parseDouble(peso.getText().toString());
        if(esc.equals("Mercúrio")){
            Double pplan = (pes/10)*0.37;
            String texto = "Peso em Mercúrio : " + pplan + "Kg";


            resultado.setText(texto);
        }
        if(esc.equals("Vênus")){
            Double pesoplaneta = (pes/10)*0.88;
            String texto = "Peso em Vênus : " + pplan + "Kg";


            resultado.setText(texto);
        }
        if(esc.equals("Marte")){
            Double pplan = (pes/10)*0.38;
            String texto = "Peso em Marte : " + pplan + "Kg";


            resultado.setText(texto);
        }
        if(esc.equals("Júpiter")){
            Double pplan = (pes/10)*2.64;
            String texto = "Peso em Júpiter : " + pplan + "Kg";


            resultado.setText(texto);
        }
        if(esc.equals("Saturno")){
            Double pplan = (pes/10)*1.15;
            String texto = "Peso em Saturno : " + pplan + "Kg";


            resultado.setText(texto);
        }
        if(esc.equals("Urano")){
            Double pplan = (pes/10)*1.17;
            String texto = "Peso em Urano : " + pplan + "Kg";


            resultado.setText(texto);
        }
    }
}