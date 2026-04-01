/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner4;

/**
 *
 * @author vasco
 */
public class AreaTriangulo {
    
    double base;
    double altura;
    
    public AreaTriangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;       
         
     }   
        
    public void CalcularArea(){
        double areafinal;
        areafinal =  (base*altura)/2;
        System.out.print("A area do triangulo é:" + areafinal);
    }
    
}
