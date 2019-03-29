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
        int cont=0;
        
       String frase =  JOptionPane.showInputDialog("Digite um frase");
       
       String palavra = "";

          String aux = "";
          String String[] = frase.split(" ");
           
          for (int j = 0; j < String.length; j++) {

              palavra = String[j].toUpperCase();     

              for(int i = 0; i<String.length;i++){

                    if(palavra.equals(String[i].toUpperCase())){
                        cont++;
                    }
                }
                if(!aux.contains(String[j].toUpperCase())) {
                    aux += String[j].toUpperCase()+",";
                    JOptionPane.showMessageDialog(null,"Frase fornecida: "+frase+
                                                       "\nPalavra fornecida: "+palavra+
                                                       "\nPalavra: "+String[j].toUpperCase()+" - "+cont);    
                }
                cont = 0;
           }        
    }
    
}
