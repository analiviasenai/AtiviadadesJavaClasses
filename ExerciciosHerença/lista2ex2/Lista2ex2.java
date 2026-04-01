/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2ex2;

/**
 *
 * @author vasco
 */
public class Lista2ex2 {
    public static void main(String[] args) {
        // Criando um Aluno
        Aluno a1 = new Aluno();
        a1.setNome("Ana Livia"); // Herdado de Pessoa
        a1.setCurso("Engenharia da Computação"); // Próprio de Aluno
        
        System.out.println("Aluno: " + a1.getNome() + " | Curso: " + a1.getCurso());
        a1.matricular();
        a1.pagarBoleto();

        System.out.println("-------------------------");

        // Criando um Professor
        Professor p1 = new Professor();
        p1.setNome("Warner"); // Herdado de Pessoa
        p1.setIdade(40);
        
        System.out.println("Professor: " + p1.getNome());
        p1.lancarNota();
    }
}