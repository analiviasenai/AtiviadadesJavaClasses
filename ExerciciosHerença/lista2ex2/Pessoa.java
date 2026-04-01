/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2ex2;

/**
 *
 * @author vasco
 */
public class Pessoa {
    // Símbolo '-' significa private
    private String nome;
    private int idade;

    public void pessoa() {
        System.out.println("Método construtor ou inicializador de pessoa.");
    }
    
    // Getters e Setters para podermos usar o nome e idade no Main
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}