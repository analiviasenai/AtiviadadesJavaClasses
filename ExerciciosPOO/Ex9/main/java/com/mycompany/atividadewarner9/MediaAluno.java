/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner9;

/**
 *
 * @author vasco
 */
public class MediaAluno {
    
  private double n1, n2, n3;

public MediaAluno(double nota1, double nota2, double nota3) {
        this.n1 = nota1;
        this.n2 = nota2;
        this.n3 = nota3;
    }  
    
    public double calcularMedia() {
        return (n1 + n2 + n3) / 3;
        
    
    } 
    
    
    

}
