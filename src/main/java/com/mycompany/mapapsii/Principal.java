/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapapsii;

import com.mycompany.mapapsii.Classes.CadHospede;
import com.mycompany.mapapsii.Classes.SistemaReserva;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Principal {
    public static void main(String[] args){
        SistemaReserva no = new SistemaReserva();
        CadHospede n = new CadHospede();
        ArrayList<CadHospede> c1 = new ArrayList<CadHospede>();
        Scanner ler = new Scanner(System.in);
        System.out.println("\n****Bem vindo ao Hotel Transilvânia!****\n\n");
        System.out.println("Já cliente? \n 1 - SIM \n 2 - NÃO");
        int op = ler.nextInt();
        if(op == 1){
            no.novaReserva(); 
        }else{
            System.out.println("Realiza o seu cadastro!");
            System.out.println("Informe seu nome");
            n.setNome(ler.next());
            System.out.println("Informe sua Idade: ");
            n.setIdade(ler.nextInt());
            System.out.println("Informe sua Rua: ");
            n.setRua(ler.next());
            System.out.println("Informe seu Número: ");
            n.setNumero(ler.nextInt());
            System.out.println("Informe seu Bairro: ");
            n.setBairro(ler.next());
            System.out.println("Informe sua Cidade: ");
            n.setCidade(ler.next());
            System.out.println("Informe seu Estado: ");
            n.setUf(ler.next());
            System.out.println("Informe seu Cep: ");
            n.setCep(ler.next());
            System.out.println("CADASTRO REALIZADO COM SUCESSO!");
            c1.add(n);
            System.out.println("Deseja realizar uma Reserva?\n1 - SIM\n2- NÃO");
            op = ler.nextInt();
            if(op == 1){
                no.novaReserva(); 
            }else{
                System.out.println("Agradecemos sua visita!");
                System.exit(0);
            }

        }
        ler.close();
        
            if(no.getQtdDiarias() > 7){
                no.calcularDesconto();
                System.out.println("Total de pessoas dentro do limite máximo!");
                System.out.println("Número da Suíte Nº "+no.getNum());
                System.out.println("Responsável: "+ no.getResponsavel());
                System.out.println("Quantidade de diárias "+no.getQtdDiarias());
                System.out.println("Quantidade de Pessoas "+ no.getQtdPessoas());
            
            }else{
                no.calculoDiaria();
                System.out.println("Total de pessoas dentro do limite máximo!");
                System.out.println("Número da Suíte Nº "+no.getNum());
                System.out.println("Responsável: "+ no.getResponsavel());
                System.out.println("Quantidade de diárias "+no.getQtdDiarias());
                System.out.println("Quantidade de Pessoas "+ no.getQtdPessoas());            
            }
    }
}
