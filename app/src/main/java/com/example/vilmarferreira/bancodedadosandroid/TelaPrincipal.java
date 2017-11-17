package com.example.vilmarferreira.bancodedadosandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TelaPrincipal extends AppCompatActivity {
    GerenciadorBanco vrBancoDados;
    EditText vrNomeCarro,vrPlaca,vrAno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        vrBancoDados = new GerenciadorBanco(this,"BDCarro",1);

        vrNomeCarro= (EditText) findViewById(R.id.editNome);
        vrPlaca= (EditText) findViewById(R.id.editPlaca);
        vrAno= (EditText) findViewById(R.id.editAno);
    }

    public void onClickSave (View v)
    {

    }
}
