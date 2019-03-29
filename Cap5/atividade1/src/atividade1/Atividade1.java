/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author THIAGO
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random sorteio = new Random();
        int gerar = sorteio.nextInt(10);
        String[] nomes = new String[10]; 
                
        
        for(int i=0; i<10; i++){
           nomes [i] = JOptionPane.showInputDialog("Entre com o "+(i+1)+" nome:");
          
        }
        JOptionPane.showMessageDialog(null,"Ganhador: "+nomes[gerar]);
    }
    
}
