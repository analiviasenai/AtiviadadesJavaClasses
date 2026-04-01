/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner14;

/**
 *
 * @author vasco
 */
import java.util.Scanner;

public class AtividadeWarner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Comparador comp = new Comparador();

        System.out.println("Digite 5 números:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();
            
            // O objeto faz a comparação
            comp.comparar(n);
        }

        System.out.println("\n--- Resultado Final ---");
        System.out.println("O maior número digitado foi: " + comp.getMaior());
        System.out.println("O menor número digitado foi: " + comp.getMenor());

        sc.close();
    }
}