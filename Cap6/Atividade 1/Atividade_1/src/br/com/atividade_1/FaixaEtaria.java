/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atividade_1;

/**
 *
 * @author Thiago
 */
public class FaixaEtaria {
    public String Idade(int idade){
        
        if(idade >= 0 && idade <=2){
            return "Bebe";
        }
        if(idade >= 3 && idade <=11){
            return "Crianca";
        }
        if(idade >= 12 && idade <=19){
            return "Adolescente";
        }
        if(idade >= 20 && idade <=30){
            return "Joven";
        }
        if(idade >= 31 && idade <=60){
            return "Adulto";
        }
        if(idade >60){
            return "Idoso";
        }  
        return null;
    } 
}
