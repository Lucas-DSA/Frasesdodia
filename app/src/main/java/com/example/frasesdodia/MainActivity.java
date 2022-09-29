package com.example.frasesdodia;

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

    public void gerarNovaFrase(View view){

        String [] frase = {
                "Que o dia comece bem e termine ainda melhor.",
                "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
                "Às vezes as coisas demoram, mas acontecem. O importante é saber esperar e não perder a fé!",
                "Imagine uma nova história para a sua vida e acredite nela.",
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "Sorria! Deus acaba de te dar um novo dia e coisas extraordinárias podem acontecer se você acreditar.",
                "Levanta, sacode a poeira e dá a volta por cima.",

        };
        int numero = new Random().nextInt(6);//0,1,2,3,4,5,6

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frase [numero] );

    }

}