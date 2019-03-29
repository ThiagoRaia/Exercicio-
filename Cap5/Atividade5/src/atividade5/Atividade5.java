/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade5;

import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author THIAGO
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String aux="";
      String status[][]=new String[6][11];
      
      int i,j,opcao=0;
      
       for(i=1; i<6; i++){
             for(j=1; j<11; j++){
                 status[i][j]="Livre";
             }
         }

      while(opcao != 3){
      aux = JOptionPane.showInputDialog("Digite\n"
                                       +"1-Para listar os quartos do hotel;\n"
                                       +"2-Para classificar o quarto;\n"
                                       +"3-Sair");
        opcao = Integer.parseInt(aux);
    
      if(opcao==1){
         for(i=1; i<6; i++){
             for(j=1; j<11; j++){
                 System.out.println("O "+(j)+"º quarto do "+(i)+"º andar está: "+status[i][j]);
             }
         }
      }
      if(opcao == 2){
         aux = JOptionPane.showInputDialog("Entre com o andar que deseja o quarto");
         i = Integer.parseInt(aux);
         
         aux = JOptionPane.showInputDialog("Entre com o numero do quarto que deseja");
         j = Integer.parseInt(aux);
         
        status[i][j] = JOptionPane.showInputDialog(" "+i+"º Andar "+j+"º Quarto\nLivre\nOcupado");
      }
      }       
   }
}