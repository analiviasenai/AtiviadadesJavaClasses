/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner12;

/**
 *
 * @author vasco
 */
public class CalculadoraProduto {
    
    public int calcularProdutoPares(int limite) {
        // Começamos com 1 porque na multiplicação, se começar com 0, o resultado sempre será 0!
        int produto = 1;
        boolean encontrouPar = false;

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) { // Verifica se o número é par
                produto *= i; // Multiplica o valor atual pelo número par encontrado
                encontrouPar = true;
            }
        }
        
        // Se o usuário digitou 1, não haverá pares, então retornamos 0
        return encontrouPar ? produto : 0;
    }
}