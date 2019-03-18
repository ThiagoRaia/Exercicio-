/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;
import java.io.IOException;
import javax.swing.*;
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
      String  aux = "";
      double valor,total = 0;
      int cod;
              
      try{ 
          aux= JOptionPane.showInputDialog("Digite o valor da mercadoria");
        valor = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Codigo 1=5%\nCodigo 2=10%\nCodigo 3=20%\nCodigo 4=50%\nDigite o codigo do desconto");
        cod= Integer.parseInt(aux);
        
            switch(cod)
            {
            case 1:total =valor-(valor * 0.05); break;
            case 2:total =valor-(valor * 0.1); break;
            case 3:total =valor-(valor * 0.2); break;
            case 4:total =valor-(valor * 0.5); break;
            default:JOptionPane.showMessageDialog(null,"Codigo do desconto invalido"); 
           }
            
            JOptionPane.showMessageDialog(null,"O valor do produto é: "+valor+"\nO Codigo do desconto é: "+cod+"\nO valor do produto com desconto é: "+total);            
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,"Digite numero inteiro\n"+erro.toString());
        }
                       
    }
    
}
