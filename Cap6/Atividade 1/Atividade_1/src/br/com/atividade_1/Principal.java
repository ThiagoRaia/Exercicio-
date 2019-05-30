/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade_1;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FaixaEtaria F = new FaixaEtaria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        System.out.println("Mensagem "+F.Idade(sc.nextInt()));
    }
    
}
