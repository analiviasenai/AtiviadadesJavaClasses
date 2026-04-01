/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadewarner1;

/**
 *
 * @author vasco
 */
public class Funcionario {
    
    private double salario;
    
    public Funcionario(double salario){
        this.salario = salario;
    }
     
    /* calcular salario atual mais o aumento */
    public double Calcularsalario(){
        double novoSalario = this.salario = salario * 1.25;
        return novoSalario;
    }
     
    /* retorna apenas salario se necessario*/
    public double getsalario(){
        return salario;
    }
    
    }

