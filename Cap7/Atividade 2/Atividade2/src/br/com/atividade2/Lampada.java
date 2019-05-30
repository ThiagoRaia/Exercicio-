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
public class Lampada extends UsaLampada {
      boolean Status;
     public void ligar(){
         Status = true;
    }
      public void desligar(){
          Status = false;
    }
     public String observar(){
         if(Status == true){
             return "Ligada";
         }
         if(Status == false){
             return "Desligada";
         }
         return null;
     }
}
