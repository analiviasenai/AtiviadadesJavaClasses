/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner3;

import java.util.Scanner;
import java.util.Locale;


public class AtividadeWarner3 {

    public static void main(String[] args) {
    Scanner sa = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite seu Sexo:");
    String sexo = sa.next();
    
    System.out.println("Digite sua Altura:");
    double altura = sa.nextDouble();
    
    SexoeAltura SA = new SexoeAltura(sexo,altura);
    
    SA.Pesoideal();
    
    
    
    
    
    }
}F
