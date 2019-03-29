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
        
        String pessoa[] = new String[5];
        
        for(int i=0; i<5; i++){
            pessoa[i] = JOptionPane.showInputDialog("Entre com o nome e o Sexo");
        }
        String sexo= JOptionPane.showInputDialog("Digite o sexo das pessoas que voce quer que apareça");
        for(int i=0; i<5; i++){
            if(pessoa.equals("masculino")) {
                JOptionPane.showMessageDialog(null,"\n"+pessoa[i]);
            }        
        }
        
        
    }
    
}
