/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner10;

/**
 *
 * @author vasco
 */
public class NumeroPrimo {

    private int num;

    // O nome aqui PRECISA ser igual ao da classe
    public NumeroPrimo(int numero) {
        this.num = numero;
    }

    // Método para verificar se é primo
    public boolean verificarSeEPrimo() {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false; // Se for divisível por qualquer outro, não é primo
            }
        }
        return true;
    }
}

