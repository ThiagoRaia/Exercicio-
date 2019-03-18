/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;
import javax.swing.JOptionPane;
/**
 *
 * @author THIAGO
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,impar=0;
        
        for(i=1; i<1001; i++)
        {
            if(i%2==1)
            {
                impar = impar+i;
            }
        }
        JOptionPane.showMessageDialog(null,"O resultado da soma é: "+impar);
    }
    
}
