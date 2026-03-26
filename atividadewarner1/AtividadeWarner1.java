/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner1;

/**
 *
 * @author vasco
 * 
 *
 */
import java.util.Scanner;
import java.util.Locale;

public class AtividadeWarner1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
     
    System.out.print("Digite o salario do funcionario atual:");
    double salarioinicial = sc.nextDouble();
    
    /*Criar objeto e levar pro construtor*/
    Funcionario func = new Funcionario(salarioinicial);
    
     double novo = func.Calcularsalario();
    
    System.out.print(novo);
    
    sc.close();
    
}



}
