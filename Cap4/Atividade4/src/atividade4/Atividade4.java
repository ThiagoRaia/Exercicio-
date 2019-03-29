/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author THIAGO
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        String msg = JOptionPane.showInputDialog("Digite uma frase que será eliminida suas vogais");
      
        String texto= msg.replaceAll("[aeiouAEIOU]","");
       
               JOptionPane.showMessageDialog(null,""+texto);
    }
    
}
