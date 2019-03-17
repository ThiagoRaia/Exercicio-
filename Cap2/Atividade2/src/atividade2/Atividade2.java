/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;
import java.util.*;
/**
 *
 * @author THIAGO
 */
public class Atividade2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float deposito,saldo=0,saque,atual=0;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Saldo atual: "+saldo);
        
        System.out.println("Digite o valor do Deposito: ");
        sc = new Scanner(System.in);
        deposito = sc.nextFloat();
       
        atual = atual + deposito;
        
        System.out.println("Saldo atual: "+atual);
        
         System.out.println("Digite o valor do Saque: ");
        sc = new Scanner(System.in);
        saque = sc.nextFloat();
        
        saldo = atual - saque;
        
        System.out.println("Saldo atual: "+saldo);

    }
    
}
