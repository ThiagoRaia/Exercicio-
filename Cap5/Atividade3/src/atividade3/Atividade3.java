/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author THIAGO
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j = 0,n;
        int aleat [][] = new int [50][20];
        boolean achou = false;
        
        String numero = JOptionPane.showInputDialog("Digite um valor");
         n = Integer.parseInt(numero);
        
        for(i=0; i<50; i++){
            for( j=0; j<20; j++){
                Random coluna = new Random();
                aleat[i][j] = coluna.nextInt(20);
                if(n==aleat[i][j])
                {
                    achou = true;
                }
            }              
        }
         if(achou){
              JOptionPane.showMessageDialog(null,"Este numero está na matriz");    
         }
         else{
              JOptionPane.showMessageDialog(null,"Este numero nao está na matriz");  
         }
         
        String resultado="";
       for(i=0; i<50; i++){
            for( j=0; j<20; j++){
                resultado += aleat[i][j];
                resultado += "  ";
            } 
            resultado +="\n";
        } 
         JOptionPane.showMessageDialog(null,resultado);      
    }
    
}
