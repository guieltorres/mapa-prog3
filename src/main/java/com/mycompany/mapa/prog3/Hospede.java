/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa.prog3;

/**
 *
 * @author onboarding
 */
public class Hospede {
    
    private int codigo;
    private String nome;
    private String endereco;
    private int idade;
    
    
     public Hospede(int codigo, String nome, String endereco, int idade) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setIdade(idade);
    }
     
     public Hospede(){}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Hospede{" + "codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + ", idade=" + idade + '}' +"\n";
    }
    
}
