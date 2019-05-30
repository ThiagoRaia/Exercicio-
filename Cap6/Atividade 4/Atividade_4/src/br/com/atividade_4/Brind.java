/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade_4;

import java.util.Random;

/**
 *
 * @author Thiago
 */
public class Brind {
    public String sorteio(int a){
        if(a == 0){
            return "Geladeira";
        }
        if(a == 1){
            return "Fogao";
        }
        if(a == 2){
            return "Microondas";
        }
        if(a == 3){
            return "1 Ano de Compras";
        }
        return null;
    }
}
