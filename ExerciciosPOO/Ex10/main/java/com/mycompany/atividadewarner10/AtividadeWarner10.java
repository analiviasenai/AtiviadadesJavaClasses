/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner10;

/**
 *
 * @author vasco
 */
import java.util.Scanner;
public class AtividadeWarner10 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
      System.out.print("Informe um numero inteiro:");
      int numero = sc.nextInt();
      
      
      NumeroPrimo NP = new NumeroPrimo(numero);
      
     if (MA.calcularMedia() >= 7.0) { 
    System.out.println("O aluno foi aprovado");
} else {
    System.out.println("O aluno foi reprovado");
}
        
        
    }
    
   
}
