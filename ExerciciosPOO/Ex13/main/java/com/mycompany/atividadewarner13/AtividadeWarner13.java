/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner13;

/**
 *
 * @author vasco
 */
import java.util.Scanner;

public class AtividadeWarner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estatistica est = new Estatistica();

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        System.out.println("--- Resultados ---");
        est.calcularMedias(numero);

        sc.close();
    }
}