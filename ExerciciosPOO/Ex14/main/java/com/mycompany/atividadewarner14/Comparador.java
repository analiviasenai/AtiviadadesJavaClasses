/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner14;

/**
 *
 * @author vasco
 */
public class Comparador {
    private int maior = Integer.MIN_VALUE; // Começa com o menor valor possível
    private int menor = Integer.MAX_VALUE; // Começa com o maior valor possível

    public void comparar(int num) {
        if (num > maior) {
            maior = num;
        }
        if (num < menor) {
            menor = num;
        }
    }

    public int getMaior() {
        return maior;
    }

    public int getMenor() {
        return menor;
    }
}