package com.example.aulati11_2019_05_27;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {
    private String opcao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner sp = findViewById(R.id.spinnerDados);
        sp.setOnItemSelectedListener(this);
        opcao = "";
    }

    public void clicouOK(View view) {
        if(!opcao.isEmpty()) {
            Intent i = new Intent(this, SorteioActivity.class);
            i.putExtra("tipoDado", opcao);
            startActivity(i);
        }
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        opcao = parent.getItemAtPosition(position).toString();
        Toast.makeText(this, "Foi selecionado a opção: "+ opcao ,
                Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
