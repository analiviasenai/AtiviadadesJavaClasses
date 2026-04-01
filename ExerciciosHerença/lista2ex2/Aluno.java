/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2ex2;

/**
 *
 * @author vasco
 */
public class Aluno extends Pessoa {
    private String curso;
    private int periodo;

    public void matricular() {
        System.out.println("Aluno matriculado com sucesso!");
    }

    public void pagarBoleto() {
        System.out.println("Boleto pago.");
    }

    // Getters e Setters para os atributos específicos
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
}