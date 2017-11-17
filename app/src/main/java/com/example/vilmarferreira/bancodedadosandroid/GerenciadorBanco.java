package com.example.vilmarferreira.bancodedadosandroid;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vilmarferreira on 16/11/2017.
 */

public class GerenciadorBanco extends SQLiteOpenHelper{

    //script de criacao de banco, tudo que for preciso para criar o banco, vai nessa script
    String[] scriptCriaBanco ={"Create table carro (_id intereger primary key autoincrement, nome text not null, placa text not null, ano text not null);"}; // comando para criar tabela no banco

    public final String scriptApagaBD= "DROP TABLE IF EXISTS carro"; // caso exita, apague os dados

    Context vrContext= null;
    GerenciadorBanco (Context context, String nome, int versao) // contexto do activity, nome do banco, versao do banco
    {
        super(context,nome,null,versao);
        vrContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // dentro do onCreate vamos executar os scripts de criacao de banco de dados
        for (int iIndex=0; iIndex<scriptCriaBanco.length; iIndex++ )
        {
            db.execSQL(scriptCriaBanco[iIndex]);
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(scriptApagaBD);

    }

    //Insert
    public void insereCarro(ContentValues dados) // procurar contentValues para uso 
    {
        SQLiteDatabase bancoDados= this.getWritableDatabase();
        bancoDados.insert("carro",null,dados);
        Toast.makeText(vrContext,"Insercao realizada", Toast.LENGTH_SHORT).show();
    }

    //Remove carro
    public void removerCarro(String placa)
    {

    }

    //Consulta
    public  ArrayList<carroModel> listaCarros()
    {
        ArrayList<carroModel> lista= new ArrayList<carroModel>();
        SQLiteDatabase bancoDados= this.getReadableDatabase();
        Cursor cursor = bancoDados.query("carro", new String[]{"nome","placa","ano"},null,null,null,null,null);
        while (cursor.moveToNext())
        {
            carroModel carro= new carroModel();
            carro.setNome(cursor.getString(0));
            carro.setPlaca(cursor.getString(1));
            carro.setPlaca(cursor.getString(2));
        }
        return lista;
    }

}
