/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner7;

public class Tabuada {
    private int n;

    // Construtor para receber o limite N
    public Tabuada(int n) {
        this.n = n;
    }

    // Método para imprimir as tabuadas usando laços aninhados
    public void imprimirTabuadas() {
        // Primeiro laço: vai de 1 até o número N informado
        for (int i = 1; i <= n; i++) {
            System.out.println("----- Tabuada do " + i + " -----");
            
            // Segundo laço: faz a multiplicação de 1 a 10 para cada i
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Pula uma linha entre as tabuadas
        }
    }
}