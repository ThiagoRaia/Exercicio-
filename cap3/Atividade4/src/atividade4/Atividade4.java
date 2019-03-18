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
       
        String Senha="";
        int i=0;

        
       while (i<3)
       {   
            Senha = JOptionPane.showInputDialog("Digite sua Senha");
            
            if(Senha.equals("Java")== false)
            {
                JOptionPane.showMessageDialog(null,"Senha Invalida\n"
                                                  +"Voce tem "+(2-i)+" Tentativa");
            }
            if(i==2)
            {
                JOptionPane.showMessageDialog(null,"Cartao Bloqueado");
            }
            if( Senha.equals("Java"))
            {
                JOptionPane.showMessageDialog(null,"Senha Valida"); 
                i=2;
            }
                i++;
       }  
    }     
  }
    
    

