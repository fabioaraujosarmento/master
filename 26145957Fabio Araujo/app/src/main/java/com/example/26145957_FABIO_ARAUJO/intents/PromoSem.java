package com.example.a26145965.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PromoSem extends AppCompatActivity {
    private Button calc;
    private TextInputEditText nome;
    private TextInputEditText vConta;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo_sem);


        calc = findViewById(R.id.btCalc);
        nome = findViewById(R.id.txtNome);
        vConta = findViewById(R.id.txtVConta);
        res = findViewById(R.id.Res);

        calc.setOnClickListener(onClick (view){
            double rcont = Double.parseDouble(vConta.getText().toString());
            String nomeCli = nome.getText().toString().charAt(0)+"";

            if (nome.equals("A")||nome.equals("E")nome.equals("I")||nome.equals("O")||nome.equals("U")){
            double desc = rcont * 0.3;

            res.setText(String.valueOf("R$ " + (rconta - desc)));
            }else{

                res.setText(String.valueOf("QUE PENA! NESTA SEMANA O DESCONTO NÃO É PARA SEU NOME, MAS CONTINUE NOS PRESTIGIANDO QUE SUA VEZ CHEGARÁ."));
        }


    }
}
