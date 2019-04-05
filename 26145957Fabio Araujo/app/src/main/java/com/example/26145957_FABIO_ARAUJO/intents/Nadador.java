package com.example.a26145965.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Nadador extends AppCompatActivity {
    private Buttom cat;
    private TextInputEditText idade;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nadador);

        cat = findViewById(R.id.bt);
        idade = findViewById(R.id.txtIdade);
        res = findViewById(R.id.Cat);

        cat.setOnClickListener(onClick (view){
            double ida = Double.parseDouble(idade.getText().toString());
            if (ida == 5 && ida <= 7 ){
                res.setText("Sua Categoria é: INFANTIL A - Sua Idade:"+ida)


          }else{
                if (ida == 8 && ida <= 10 ){
                    res.setText("Sua Categoria é: INFANTIL B - Sua Idade:"+ida)


            }else{
                    if (ida == 11 && ida <= 13 ){
                        res.setText("Sua Categoria é: JUVENIL A - Sua Idade:"+ida)

                }else{
                        if (ida == 14 && ida <= 17 ){
                            res.setText("Sua Categoria é: JUVENIL B - Sua Idade:"+ida)

                    }else{


                        if (ida >= 18 ) {
                            res.setText("Sua Categoria é: SÊNIOR - Sua Idade:" + ida)
                        }
                    }

        }


    }
}
