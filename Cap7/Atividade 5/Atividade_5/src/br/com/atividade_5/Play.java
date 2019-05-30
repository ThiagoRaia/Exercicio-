/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade_5;

/**
 *
 * @author Thiago
 */
public class Play implements Jogo{

    @Override
    public void Andar() {
        System.out.println("Andando");
    }

    @Override
    public void pular() {
        System.out.println("Pulando");
    }

    @Override
    public void Chutar() {
        System.out.println("Chutando");
    }
    
}
