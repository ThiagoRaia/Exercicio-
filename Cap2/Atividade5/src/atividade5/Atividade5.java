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
        
        String aux = "";
        
        float veloc = 250000;
        float arq,result;
        
        aux = JOptionPane.showInputDialog("Digite o tamanho do documento para download");
         arq = Float.parseFloat(aux);
         
         result = arq /veloc;
         
         JOptionPane.showMessageDialog(null,"Tamanho do arquivo em bites: "+arq+"\n"+"O download levará "+result+" segundos para ser concluido");
    }
    
}
