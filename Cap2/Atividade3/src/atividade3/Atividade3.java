/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3;
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
        
        String aux = "";
        
        float altura, peso,imc;
        
        aux = JOptionPane.showInputDialog("Digite sua peso");
        peso = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Digite sua altura");
        altura = Float.parseFloat(aux);
        
        imc = peso/(altura*altura);
        
        if(imc < 18.5)
        {
        JOptionPane.showMessageDialog(null, "Peso a baixo do normal");
        }
         if(imc >= 18.5 && imc < 24.4)
        {
        JOptionPane.showMessageDialog(null, "Peso ideal");
        }
          if(imc >= 24.5 && imc < 29.9)
        {
        JOptionPane.showMessageDialog(null, "Pre-Obesidade");
        }
           if(imc >= 30 && imc < 35)
        {
        JOptionPane.showMessageDialog(null, "Obesidade Classe 1");
        }
            if(imc >= 35 && imc < 39.9)
        {
        JOptionPane.showMessageDialog(null, "Obesidade Classe 2(Severa)");
        }
             if(imc >=39.9)
        {
        JOptionPane.showMessageDialog(null, "Obesidade Classe 3 (Morbida");
        }
         
        
    }
    
}
