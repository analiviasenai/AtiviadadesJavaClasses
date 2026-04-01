/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner13;

/**
 *
 * @author vasco
 */
public class Estatistica {
    
    public void calcularMedias(int limite) {
        double somaPares = 0, somaImpares = 0;
        int qtdPares = 0, qtdImpares = 0;

        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                somaPares += i;
                qtdPares++;
            } else {
                somaImpares += i;
                qtdImpares++;
            }
        }

        // Cálculo e exibição das médias
        if (qtdPares > 0) {
            System.out.println("Média dos pares: " + (somaPares / qtdPares));
        } else {
            System.out.println("Nenhum número par encontrado.");
        }

        if (qtdImpares > 0) {
            System.out.println("Média dos ímpares: " + (somaImpares / qtdImpares));
        } else {
            System.out.println("Nenhum número ímpar encontrado.");
        }
    }
}
