package com.example.scorpsolutions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void retornaResultado(View view)
    {
        TextView texto = findViewById(R.id.txtResultadoFinal);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        texto.setText(String.valueOf(numeroAleatorio));
    }
}