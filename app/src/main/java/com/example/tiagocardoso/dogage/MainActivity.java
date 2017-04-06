package com.example.tiagocardoso.dogage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = (EditText) findViewById(R.id.editTextIdade);
        botaoIdade = (Button) findViewById(R.id.idbuttonCalcular);
        resultadoIdade = (TextView) findViewById(R.id.textViewResultado);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //buscar o que foi digitado
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()){
                    resultadoIdade.setText("Nenhum numero digitado");

                }else {
                    int valorDigitado = Integer .parseInt(textoDigitado);
                    int resultadoFinal = valorDigitado * 7;
                    resultadoIdade.setText("A idade do seu DOG é " + resultadoFinal + "anos");
                }
            }
        });
    }
}
