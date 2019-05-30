/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade.pkg3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PegaMes P = new PegaMes();
        Scanner Sc = new Scanner(System.in);
        
       String data =  JOptionPane.showInputDialog("Digite o dia, mes e ano separados pela barra no formato 00/00/0000");
        JOptionPane.showMessageDialog(null,"Data Fornecida: "+data+"\nMes: "+ P.PegaMes(data));
    }   
}
