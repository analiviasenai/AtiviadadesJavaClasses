/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner4;

/**
 *
 * @author vasco
 */
import java.util.Scanner;
import java.util.Locale;

public class AtividadeWarner4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        
        System.out.println("Digite a medida da base do triangulo:");
        double base = sc.nextDouble();
        
        System.out.println("Digite a medida da altura do triangulo:");
        double altura = sc.nextDouble();
        
        AreaTriangulo AT = new AreaTriangulo(base,altura);
        
        AT.CalcularArea();
    }
}
