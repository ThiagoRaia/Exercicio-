/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author THIAGO
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random dado = new Random();
        int gerar = dado.nextInt(7)+1;
        JOptionPane.showMessageDialog(null, "Numero Sorteado: "+gerar);
    }
    
}
