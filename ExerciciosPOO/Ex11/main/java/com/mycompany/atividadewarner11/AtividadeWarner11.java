/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner11;

/**
 *
 * @author vasco
 */
import java.util.Scanner;

public class AtividadeWarner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimosEntre lp = new PrimosEntre(); // Criando o objeto

        System.out.print("Digite um número limite: ");
        int limite = sc.nextInt();

        System.out.println("Números primos entre 1 e " + limite + ":");

        // O laço percorre todos os números até o limite
        for (int i = 1; i <= limite; i++) {
            // O objeto verifica se o número atual (i) é primo
            if (lp.ehPrimo(i)) {
                System.out.print(i + " "); 
            }
        }
        
        sc.close();
    }
}