package com.mycompany.atividadewarner2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vasco
 */

import java.util.Scanner;
import java.util.Locale;


public class Classificacaoidade {
    
   private int idade;
   
   public Classificacaoidade(int idade){
       this.idade = idade;
   }
   
   public void Clidade(){
       if (idade >= 5 && idade <= 7) {
    System.out.println("Infantil A");
} else if (idade >= 8 && idade <= 10) {
    System.out.println("Infantil B");
} else if (idade >= 11 && idade <= 13) {
    System.out.println("Juvenil A");
} else if (idade >= 14 && idade <= 17) {
    System.out.println("Juvenil B");
} else if (idade >= 18) {
    System.out.println("Adulto");
} else {
    System.out.println("Idade fora das categorias (muito jovem)");
}
      
   }
   
}