package com.example.ejerciciopooandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejerciciopooandroid.clases.OperadoresLogicos;

public class MainActivity extends AppCompatActivity {
    OperadoresLogicos operadoresLogicos = new OperadoresLogicos();

    private EditText valor1;
    private EditText valor2;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button calcularsuma;
        Button calcularresta;
        Button calcularmultiplica;
        Button calculardivide;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.txtNumero1);
        valor2 = findViewById(R.id.txtNumero2);
        resultado = findViewById(R.id.lblResultado);
        calcularsuma = findViewById(R.id.btnSumar);
        calcularresta = findViewById(R.id.btnResta);
        calcularmultiplica = findViewById(R.id.btnMultiplica);
        calculardivide = findViewById(R.id.btnDivide);


        calcularsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadoresLogicos.setValor1(Double.parseDouble(valor1.getText().toString()));
                operadoresLogicos.setValor2(Double.parseDouble(valor2.getText().toString()));

                resultado.setText(String.valueOf(operadoresLogicos.sumar()));
                resultado.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, String.valueOf(operadoresLogicos.sumar()), Toast.LENGTH_LONG).show();
            }
        });
        calcularresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadoresLogicos.setValor1(Double.parseDouble(valor1.getText().toString()));
                operadoresLogicos.setValor2(Double.parseDouble(valor2.getText().toString()));
                resultado.setText(String.valueOf(operadoresLogicos.restar()));

                resultado.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, String.valueOf(operadoresLogicos.restar()), Toast.LENGTH_LONG).show();
            }
        });
        calcularmultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadoresLogicos.setValor1(Double.parseDouble(valor1.getText().toString()));
                operadoresLogicos.setValor2(Double.parseDouble(valor2.getText().toString()));
                resultado.setText(String.valueOf(operadoresLogicos.multiplica()));

                resultado.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, String.valueOf(operadoresLogicos.multiplica()), Toast.LENGTH_LONG).show();
            }
        });
        calculardivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operadoresLogicos.setValor1(Double.parseDouble(valor1.getText().toString()));
                operadoresLogicos.setValor2(Double.parseDouble(valor2.getText().toString()));
                resultado.setText(String.valueOf(operadoresLogicos.divide()));

                resultado.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, String.valueOf(operadoresLogicos.divide()), Toast.LENGTH_LONG).show();
            }
        });
    }
}
