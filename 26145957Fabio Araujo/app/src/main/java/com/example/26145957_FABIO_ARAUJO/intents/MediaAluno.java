package com.example.a26145965.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MediaAluno extends AppCompatActivity {

    private TextInputEditText nome;
    private TextInputEditText av1;
    private TextInputEditText av2;
    private TextView mediaav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_aluno);
        nome = findViewById(R.id.nome);
        av1 = findViewById(R.id.nota1);
        av2 = findViewById(R.id.nota2);
        mediaav = findViewById(R.id.resultado);
    }

    public void Media(View v) {
        double mav1 = Double.parseDouble(m1.getText().toString());
        double mav2 = Double.parseDouble(m2.getText().toString());
        double media = (mav1 + mav2) / 2;

        if (media >= 7) {

            String texto = "Nome do aluno: " + nome.getText().toString() + ", " + "Média: " + media + ", " + "APROVADO";
            mediaav.setText(texto);

        } else {
            if (media =>4 && media < 7 ){

                String texto = "Nome do aluno: " + nome.getText().toString() + ", " + "Média: " + media + ", " + "PROVA FINAL";
                mediaav.setText(texto);

            }else{


                String texto = "Nome do aluno: " + nome.getText().toString() + ", " + "Média: " + media + ", " + "REPROVADO";
                mediaav.setText(texto);
            }
        }
    }
}
