/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2ex1;

/**
 *
 * @author vasco
 */
public class Transporte {
    // Atributos privados
    private String marca;
    private String modelo;

    // Construtor
    public Transporte() {
    }

    // Métodos públicos
    public void ligarMotor() {
        System.out.println("Motor ligado!");
    }

    public void movimento(int codInstrucao) {
        System.out.println("Transporte se movimentando com instrução: " + codInstrucao);
    }
}