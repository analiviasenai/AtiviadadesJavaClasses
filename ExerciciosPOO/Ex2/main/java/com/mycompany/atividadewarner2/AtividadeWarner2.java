/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author vasco
 */
public class AtividadeWarner2 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US); 
    
    
    System.out.print("Digite sua idade:");
    int idadeatual = sc.nextInt();
    
   Classificacaoidade cl = new Classificacaoidade(idadeatual); 
   
   cl.Clidade();
    }
    
    
}
