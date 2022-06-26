/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapapsii.Classes;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class SistemaReserva extends TipoSuite{
    private int qtdDiarias;
    private int qtdPessoas;
    private String responsavel;

    public int getQtdDiarias() {
        return this.qtdDiarias;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public int getQtdPessoas() {
        return this.qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public String getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    public void novaReserva() {
        Scanner ler = new Scanner(System.in);
        System.out.println("***Solicitar Nova Reserva***\n");
        System.out.println("**Suite de luxo**\nValor da diária R$60,00\n");
        System.out.println("**Suite simples**\nValor diária R$30,00\n");

        System.out.println("Qual o tipo da Suite?");
        System.out.println("1 - Suite de Luxo\n2 - Suite Simples ");
        int op = ler.nextInt();
        if(op == 1){
            setNum(60);
            setCapaciPessoas(6);
            setValorDiaria(60.00);
            System.out.println("Reservas com mais de 7 dias será consedido desconto de 10%");
            System.out.print("Informa a quantidade de Diárias: ");
            
            setQtdDiarias(ler.nextInt());
            while(true){
                System.out.println("Informa a quantidade de pessoas incluindo crianças maiores de 2 anos: ");
                System.out.println("Bebês até 2 anos não contam na capacidade máxima da suite.\nCAPACIDADE MÁXIMA 6 PESSOAS");
                setQtdPessoas(ler.nextInt());
                if(getQtdPessoas() > getCapaciPessoas()){
                    System.out.println("Para esse tipo de suite a capacidade maxima é 6 pessoas");
                }else{
                    System.out.print("\nInforme o Responsável pela Reserva: ");
                    setResponsavel(ler.next());
                    break;
                }
            }
        }
        if(op == 2){
            setNum(10);
            setCapaciPessoas(3);
            setValorDiaria(30.00);
            System.out.print("Informa a quantidade de Diárias: ");
            setQtdDiarias(ler.nextInt());
            while(true){
                System.out.println("Informa a quantidade de pessoas incluindo crianças maiores de 2 anos: ");
                System.out.println("Bebês até 2 anos não contam na capacidade máxima da suite.\nCAPACIDADE MÁXIMA 3 PESSOAS");
                setQtdPessoas(ler.nextInt());
                if(getQtdPessoas() > getCapaciPessoas()){
                    System.out.println("Para esse tipo de suite a capacidade maxima é 3 pessoas");
                }else{
                    System.out.print("\nInforme o Responsável pela Reserva:\n ");
                    setResponsavel(ler.next());
                    break;
                }
            }
        }
        ler.close();
    }
    public void calculoDiaria(){
        Double valor;
        valor = getQtdDiarias() * getValorDiaria();
        System.out.println("\n\nValor total da Rerserva R$ "+ valor);
    }
    public void calcularDesconto(){
        Double valor;
        valor = getValorDiaria() * getQtdDiarias();
        Double res = (valor / 100) * 10;
        Double valor2 =  valor - res;
        System.out.println("\n\nValor total da Rerserva R$ "+ valor+" com desconto de 10% Valor total a pagar R$ "+ valor2);
    
    }
}
