/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapapsii.Classes;

/**
 *
 * @author bruno
 */
public abstract class TipoSuite {
    private int num;
    private int capaciPessoas;
    private Double valorDiaria;

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCapaciPessoas() {
        return this.capaciPessoas;
    }

    public void setCapaciPessoas(int capaciPessoas) {
        this.capaciPessoas = capaciPessoas;
    }

    public Double getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
