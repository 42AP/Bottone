package com.alby7503.bottone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView scritta;
    private final String[] nomi = { "Pamela", "Balocchi", "Beghea", "Bonfini", "Buonuomo", "Cameriere", "Cervoni",
            "De Micheli", "Fontana", "Gallo", "Franco", "Lattanzi", "Lopatowski", "Manili", "Mena", "Morelli",
            "Paolozzi", "Pietrucci", "Petralia", "Puzzello", "Vona", "Zambrano", "Zouairi" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(v -> {
            int indice = new Random().nextInt(nomi.length);
            String nome = nomi[indice];
            scritta = (TextView)findViewById(R.id.textView);
            scritta.setText("Persona: " + nome);
        });
    }
}