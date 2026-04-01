/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2ex1;

/**
 *
 * @author vasco
 */
public class Lista2ex1 {
    public static void main(String[] args) {
        // Criando o Carro
        Carro meuCarro = new Carro();
        System.out.println("--- Testando o Carro ---");
        meuCarro.ligarMotor();      // Herdado de Transporte
        meuCarro.ligarRadio();      // Próprio de Carro
        meuCarro.abrirPortaMalas(); // Próprio de Carro
        meuCarro.movimento(1);      // Herdado de Transporte

        System.out.println("\n--- Testando a Moto ---");
        // Criando a Moto
        Moto minhaMoto = new Moto();
        minhaMoto.ligarMotor();      // Herdado de Transporte
        minhaMoto.baixarDescanso();  // Próprio de Moto
        minhaMoto.movimento(2);      // Herdado de Transporte
    }
}