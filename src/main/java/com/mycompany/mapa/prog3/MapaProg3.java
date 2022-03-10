/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mapa.prog3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author onboarding
 */
public class MapaProg3 {
    
static Scanner tec = new Scanner(System.in);

    public static void main(String[] args) {
        
        Reserva r = new Reserva();
        Hospede h = new Hospede();
        Suite s = new Suite();
        ArrayList<Reserva> rList = new ArrayList<Reserva>();
        
        
        int opcao = 0;
        
        while (opcao != 9){
            
            System.out.println("\nSELECIONE A OPÇÃO DESEJADA: \n");
            System.out.println("1 - NOVA RESERVA");
            System.out.println("2 - LISTAR RESERVAS");
            System.out.println("3 - CALCULAR DIÁRIA DA ÚLTIMA RESERVA");
            System.out.println("4 - VERIFICAR SE HÁ CAPACIDADE NA ÚLTIMA RESERVA");
            
            opcao = tec.nextInt();
            tec.nextLine();
            
            
            switch (opcao){
                case 1: 
                    rList.add(Reservar(r));
                    break;
                case 2: 
                    System.out.println(rList);
                    break;
                case 3: 
                    int index = rList.size() - 1;
                    System.out.print(rList.get(index).calcularDiaria());
                    break;
                case 4: 
                    index = rList.size() - 1;
                    System.out.print(rList.get(index).verificarCapacidade());
                    break; 
                case 9:
                    System.out.println("Programa encerrado.");
                    break;
            }
        }
    }
        
    static int codigoH = 0;
    static int numeroS = 0;
    static int codigoR = 0;
    
        
    private static Reserva Reservar(Reserva r){
        Scanner tec = new Scanner(System.in);
        boolean shouldContinue = true;
        ArrayList<Hospede> hList = new ArrayList<Hospede>();
        
        int countIdade = 1;
        
//      Adicionando suite à reserva
        Suite s = new Suite();
        
        System.out.println("Digite o tipo de suíte:");
        
        String tipo = tec.nextLine();

        System.out.println("Digite a capacidade da suíte:");
        int capacidade = tec.nextInt();

        System.out.println("Digite o valor da diária:");
        double valorDiaria = tec.nextDouble();
        
        s.setNumero(numeroS);
        numeroS++;
        
        s.setTipo(tipo);
        s.setCapacidade(capacidade);
        s.setValorDiaria(valorDiaria);
        r.setSuite(s);
        
        tec.nextLine();
        
        //Adicionando hospedes à reserva
        while(shouldContinue == true) {

            System.out.println("Digite o nome do hóspede:");
            String nome = tec.nextLine();

            System.out.println("Digite o endereço do hóspede:");
            String endereco = tec.nextLine();

            System.out.println("Digite a idade do hóspede:");
            int idade = tec.nextInt();
            
            Hospede h = new Hospede(codigoH, nome, endereco, idade);
            codigoH++;
            hList.add(h);
            
             if (idade > 2) {
                r.setQuantidadePessoas(countIdade);
                countIdade++;
                if (r.getQuantidadePessoas() > s.getCapacidade()) {
                    System.out.println("Capacidade da suíte excedida");
                    r.setQuantidadePessoas(s.getCapacidade());
                    int index = hList.size() - 1;
                    hList.remove(index);
                }
            }
             
            System.out.println("Deseja cadastrar outro hóspede? \n1 - Sim / 2 - Não");
            int userChoice = tec.nextInt();
            
            switch (userChoice) {
                case 1:
                    shouldContinue = true;
                    break;
                case 2:
                    shouldContinue = false;
                    r.setHospedes(hList);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
            tec.nextLine();
        }
        
        // Adicionando Reserva
        System.out.println("Digite a quantidade de dias");
        int quantidadeDias = tec.nextInt();
        r.setQuantidadeDias(quantidadeDias);
        
        return r;
    }
}
        
        
        

