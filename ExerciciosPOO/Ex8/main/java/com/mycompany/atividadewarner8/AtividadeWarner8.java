/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner8;

import java.util.Scanner;

public class AtividadeWarner8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        // Criando o objeto 'objFatorial' a partir da classe 'Fatorial'
        Fatorial objFatorial = new Fatorial();
        
        System.out.println("--- Sistema de Cálculo Fatorial ---");
        System.out.print("Digite um número inteiro: ");
        int numDigitado = leitor.nextInt();
        
        // Chamando o método através do objeto
        long resultado = objFatorial.calcular(numDigitado);
        
        System.out.println("O fatorial de " + numDigitado + " é: " + resultado);
        
        leitor.close();
    }
}