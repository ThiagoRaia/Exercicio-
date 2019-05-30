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
public class Caminhao {
    int combustivel;
    double velocidade;

    /**
     *
     * @param combustivel
     * @param velocidade
     */
    public void Caminhao(){
        this.combustivel = 0;
        this.velocidade = 0;
    }

    public void AumentarVelocidade(){
        this.velocidade++;
    }
    public void AbaixarVelocidade(){
        this.velocidade--;
    }
    public void Combustivel(int combustivel){
      this.combustivel = combustivel;
    }
    public void Mostrar(){
       if(this.combustivel == 0){
          System.out.println("Gasolina");
      }
       if(this.combustivel == 1){
          System.out.println("Diesel");
      }
        if(this.combustivel == 2){
          System.out.println("Gas");
      }
        System.out.println("Velocidade: "+this.velocidade);
    }
}
