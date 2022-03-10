/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapa.prog3;

import java.util.ArrayList;

/**
 *
 * @author onboarding
 */
public class Reserva {
    private int codigo;
    
    private ArrayList<Hospede> hospedes;
    private Suite suite;
    private int quantidadePessoas;
    private int quantidadeDias;
    
    public Reserva(){}
    
    public Reserva(ArrayList<Hospede> hospedes, Suite suite, int quantidadeDias, int quantidadePessoas, int codigo) {
        this.setHospedes(hospedes);
        this.setSuite(suite);
        this.setQuantidadeDias(quantidadeDias);
        this.setQuantidadePessoas(quantidadePessoas);
        this.setCodigo(codigo);
        
    }

    public ArrayList<Hospede> getHospedes() {
        return hospedes;
    }

    public void setHospedes(ArrayList<Hospede> hospedes) {
        this.hospedes = hospedes;
    }

    public Suite getSuite() {
        return suite;
    }

    public void setSuite(Suite suite) {
        this.suite = suite;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "código da reserva=" + codigo + ", hospedes=" + hospedes + ", suite=" + suite + ", quantidadePessoas=" + quantidadePessoas + ", quantidadeDias=" + quantidadeDias + '}' + "\n";
    }
    
    public boolean verificarCapacidade() {
        boolean capacidade = false;
        if (quantidadePessoas < suite.getCapacidade()){
            System.out.print(suite.getCapacidade());
            capacidade = true;
        }
        return capacidade;
    }
    
    public double calcularDiaria() {
        System.out.println(this.getQuantidadeDias());
        System.out.println(this.suite.getValorDiaria());
        
        double valor = quantidadeDias * suite.getValorDiaria();
        
        if (quantidadeDias > 7){
            double desconto = quantidadeDias * suite.getValorDiaria() * 0.1;
            valor = quantidadeDias * suite.getValorDiaria() - desconto;
            return valor;
        }
        return valor;
    }
}
