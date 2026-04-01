/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner8;

/**
 *
 * @author vasco
 */
public class Fatorial {
    
    // Atributo para armazenar o número (opcional, mas bom para POO)
    private int numero;

    // Método que calcula e retorna o fatorial
    public long calcular(int n) {
        long fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}