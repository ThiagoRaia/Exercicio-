/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade2;

/**
 *
 * @author Thiago
 */
public class UsaLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Lampada lampada1 = new Lampada();
       Lampada lampada2 = new Lampada();
       
       lampada1.ligar();
       lampada2.desligar();
       
       System.out.println(lampada1.observar());
       System.out.println(lampada2.observar());
       
    }
    
}
