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
       Random aleatorio = new Random();
        int gerar = aleatorio.nextInt(10)+1;
        int resp;
       
        String valor = JOptionPane.showInputDialog("Digite um valor entre 0 e 9");
        resp = Integer.parseInt(valor);
        
        if(gerar == resp){
            JOptionPane.showMessageDialog(null, "Voce acertou"+"\nNumero sorteado: "+gerar+"\n Numero digitado: "+resp);
        }
        else{
            JOptionPane.showMessageDialog(null, "Voce errou"+"\nNumero sorteado: "+gerar+"\n Numero digitado: "+resp);
        }
            
    }
    
}
