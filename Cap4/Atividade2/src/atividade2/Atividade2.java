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
        
       String aux = "";
       float valor,desc,total;
       aux =  JOptionPane.showInputDialog("Digite o Valor da mercadoria");
       valor = Float.parseFloat(aux);
       
       aux = JOptionPane.showInputDialog("digite o valor do desconto");
       desc = Float.parseFloat(aux);
       
       total = valor - desc;
       
       JOptionPane.showMessageDialog(null,"Valor original: "+valor+"\nPercentual de desconto: "+desc+"\nValor Final com desconto: "+Math.floor(total));
    }
    
}
