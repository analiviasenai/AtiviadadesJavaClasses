/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadewarner7;

import java.util.Scanner;

public class AtividadeWarner7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Exibir tabuada de 1 até quanto? Digite N: ");
        int nDigitado = sc.nextInt();

        // Criando o objeto da classe Tabuada
        Tabuada tab = new Tabuada(nDigitado);

        // Chamando o método que faz os laços
        tab.imprimirTabuadas();
    }
}

