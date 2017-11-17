package com.example.vilmarferreira.bancodedadosandroid;

/**
 * Created by vilmarferreira on 16/11/2017.
 */

public class carroModel {
    String nome,placa,ano;

    public carroModel()
    {

    }

    public carroModel(String nome, String placa, String ano) {
        this.nome = nome;
        this.placa = placa;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
