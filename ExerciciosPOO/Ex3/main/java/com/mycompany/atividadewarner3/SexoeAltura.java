/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner3;

/**
 *
 * @author vasco
 */
public class SexoeAltura {
    // Atributos
    String sexo;
    double altura;

    // O CONSTRUTOR precisa estar assim:
    public SexoeAltura(String sexo, double altura) {
        this.sexo = sexo;
        this.altura = altura;
    }
    
    public void Pesoideal(){
        
        double pesoIdeal;
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal para homem: " + pesoIdeal);
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal para mulher: " + pesoIdeal);
        } else {
            System.out.println("Sexo inválido! Use M ou F.");
        }
    }

    
        
    }
    
    
    
    
    
    
    
    

    

