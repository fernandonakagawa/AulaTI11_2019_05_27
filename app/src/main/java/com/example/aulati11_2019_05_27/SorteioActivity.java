package com.example.aulati11_2019_05_27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;

public class SorteioActivity extends AppCompatActivity {
    private String opcaoEscolhida;
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorteio);
        opcaoEscolhida = getIntent().getStringExtra("tipoDado");
        rand = new Random();
        ImageView iv = findViewById(R.id.imagemDado);
        if(opcaoEscolhida.equals("D6"))         iv.setImageResource(R.drawable.d6);
        else if(opcaoEscolhida.equals("D8"))    iv.setImageResource(R.drawable.d8);
        else if(opcaoEscolhida.equals("D10"))   iv.setImageResource(R.drawable.d10);
        else if(opcaoEscolhida.equals("D20"))   iv.setImageResource(R.drawable.d20);
        else if(opcaoEscolhida.equals("D100"))  iv.setImageResource(R.drawable.d100);

        }
    }

    public void clicouSorteio(View view) {
        int max = -1;
        if(opcaoEscolhida.equals("D6"))         max = 6;
        else if(opcaoEscolhida.equals("D8"))    max = 8;
        else if(opcaoEscolhida.equals("D10"))    max = 10;
        else if(opcaoEscolhida.equals("D20"))    max = 20;
        else if(opcaoEscolhida.equals("D100"))    max = 100;
        int sorteio = rand.nextInt(max)+1;
        TextView t = findViewById(R.id.tvNumero);
        t.setText(String.valueOf(sorteio));
    }
}
