/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade_4;

/**
 *
 * @author Thiago
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Caminhao c = new Caminhao();
      c.Caminhao();
      c.Combustivel(1);
      c.AumentarVelocidade();
      c.AumentarVelocidade();
      c.AbaixarVelocidade();
      c.Mostrar();
      
    }
    
}
