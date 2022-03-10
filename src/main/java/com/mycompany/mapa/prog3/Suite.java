/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa.prog3;

/**
 *
 * @author onboarding
 */
public class Suite {
    private int numero;
    private String tipo;
    private int capacidade;
    private double valorDiaria;

    public Suite(){}
            
    public Suite(int numero, String tipo, int capacidade, double valorDiaria) {
        this.setNumero(numero);
        this.setTipo(tipo);
        this.setCapacidade(capacidade);
        this.setValorDiaria(valorDiaria);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    @Override
    public String toString() {
        return "Suite{" + "Número da suíte=" + numero + ", tipo=" + tipo + ", capacidade=" + capacidade + ", valorDiaria=" + valorDiaria + '}' + "\n";
    }
}
