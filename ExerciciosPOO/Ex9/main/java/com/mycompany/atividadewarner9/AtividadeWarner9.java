/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner9;

/**
 *
 * @author vasco
 */

import java.util.Scanner;

public class AtividadeWarner9 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Digite a Primeira nota Do aluno:");
    double nota1 = sc.nextDouble();
    System.out.print("Digite a Segunda nota Do aluno:");
    double nota2 = sc.nextDouble();
    System.out.print("Digite a Terceira nota Do aluno:");
    double nota3 = sc.nextDouble();
    
    MediaAluno MA = new MediaAluno(nota1, nota2, nota3);
    
     if (MA.calcularMedia() >= 7.0) {
    System.out.println("O aluno foi aprovado");
} else {
    System.out.println("O aluno foi reprovado");
}
   sc.close();
        
   
    }
}
