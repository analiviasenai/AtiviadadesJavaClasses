/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner5;

public class SomaImpares {
    // Atributo para guardar o total acumulado
    private int somaTotal = 0;

    // Método que recebe um número e soma se for ímpar
    public void processarNumero(int num) {
        // O operador % pega o resto da divisão por 2
        if (num % 2 != 0) {
            somaTotal += num; 
        }
    }

    // Método para mostrar o resultado final
    public void exibirResultado() {
        System.out.println("A soma de todos os números ímpares digitados é: " + somaTotal);
    }
}