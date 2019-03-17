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
        String aux = "";
        
        float n1, n2,soma,sub,div,mult;
        
        aux = JOptionPane.showInputDialog("Digite o primeiro valor");
        n1 = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Digite o segundo valor");
        n2 = Float.parseFloat(aux);
        
        soma = n1+n2;
        sub = n1-n2;
        div = n1/n2;
        mult = n1*n2;
        
        JOptionPane.showMessageDialog(null, "Soma: "+soma +"\n"+"Subtração: "+sub+"\n"+"Divisão: "+div+"\n"+"Miltiplicação "+mult);
        
        
    }
    
}
