/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import javax.swing.JOptionPane;

/**
 *
 * @author THIAGO
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int soma = 0,max=0,min=0;
        int num [] = new int[10];
        for(int i=0; i<10; i++){
           String Numero = JOptionPane.showInputDialog("Digite o "+(i+1)+" Numero");
            num [i] = Integer.parseInt(Numero);
        
           soma = soma+num[i];
           
           if(i== 0){
               max = num[i];
               min = num[i];
           }
           if(num [i]>=max){
               max = num[i];
           }
           if(num[i] <=min){
               min = num[i];
           }
           
    }
        JOptionPane.showMessageDialog(null,"A soma de todos os numeros é: "+soma);
           JOptionPane.showMessageDialog(null,"O maior numero digitado é: "+max);
           JOptionPane.showMessageDialog(null,"O menor numero digitado é: "+min);
    }
    
}
