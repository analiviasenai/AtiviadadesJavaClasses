/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner5;

/**
 *
 * @author vasco
 */
import java.util.Scanner;
import java.util.Locale;

public class AtividadeWarner5 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int somaImpares = 0; // Variável para guardar o total
    int numero;

    System.out.println("Digite 10 números inteiros:");

    // O laço vai repetir 10 vezes
    for (int i = 1; i <= 10; i++) {
        System.out.print("Número " + i + ": ");
        numero = sc.nextInt();

        // Verifica se o número é ímpar usando o resto da divisão (%)
        if (numero % 2 != 0) {
            somaImpares += numero; // Soma apenas se for ímpar
        }
    }

    System.out.println("A soma de todos os números ímpares é: " + somaImpares);
}
}