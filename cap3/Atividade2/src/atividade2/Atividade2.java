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
      
        String aux="";
        int idade[]=new int[4],maior=0,menor=0;
        
        for(int i=0; i<4; i++)
        {
        aux = JOptionPane.showInputDialog("Digite sua Idade ");
        idade[i]=Integer.parseInt(aux);
        
        if(i==0)
        {
            maior = idade[i];
            menor = idade[i];
        }
        if(idade[i]>=maior)
        {
            maior = idade[i]; 
        }
        if(idade[i]<=menor)
        {
            menor=idade[i];
        }
            
        }
        
            JOptionPane.showMessageDialog(null,"Idade Fornecida\n"+idade[0]+" "+idade[1]+" "+idade[2]+" "+idade[3]+"\n"+
                                               "A maior idade Fornecida foi:  "+maior+"\n"+
                                               "A menor idade Fornecida foi:  "+menor);
    }
    
}
