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
        
      String  aux = "";
        
        float num1, num2;
        
      String letraString;
      char letra;
      
      aux = JOptionPane.showInputDialog("Digite o primeiro valor");
      num1 = Float.parseFloat(aux);
      
      aux = JOptionPane.showInputDialog("Digitte o segundo valor");
      num2 = Float.parseFloat(aux);
      
      letraString = JOptionPane.showInputDialog("Digite a letra \n A para soma \n B para subtração \n C para multiplicação \n D para divisão \n"
                                         +"Digite a letra correspondente a operacao matematica");
      letra=letraString.charAt(0);
     
      if(letra == 'A')
      {
          JOptionPane.showMessageDialog(null,"Os numeros digitados foram: "+num1+" e "+num2+"\n"
                                            +"A operacao escolhida foi: Soma"+"\n"
                                            +"A soma dos numeros digitados é: "+(num1+num2));
      }
     else if(letra == 'B')
      {
          JOptionPane.showMessageDialog(null,"Os numeros digitados foram: "+num1+" e "+num2+"\n"
                                            +"A operacao escolhida foi: Subtracao"+"\n"
                                            +"A Subtração dos numeros digitados é: "+(num1-num2));
      }
     else if(letra == 'C')
      {
          JOptionPane.showMessageDialog(null,"Os numeros digitados foram: "+num1+" e "+num2+"\n"
                                            +"A operacao escolhida foi: Multiplição"+"\n"
                                            +"A multiplicação dos numeros digitados é: "+(num1*num2));
      }
     else if(letra == 'D')
      {
          JOptionPane.showMessageDialog(null,"Os numeros digitados foram: "+num1+" e "+num2+"\n"
                                            +"A operacao escolhida foi: Divisão"+"\n"
                                            +"A divisao dos numeros digitados é: "+(num1/num2));
      }
      else
          JOptionPane.showMessageDialog(null,"Letra Invalida");  
      }
      
    }
    

