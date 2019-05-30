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
public class Buscas extends UsaBuscas {
    public boolean BuscaNumero(int a,int []vetor){
     int i;
        for(i=0; i<vetor.length; i++){
            if(vetor[i] == a){
            return true;
            }
        }   
                return false;
    }
    public String BuscaPalavra (String []Palavra){
        for(int i=0; i<Palavra.length; i++){
            if(Palavra[i] == "sexo"){
            return "sim";
            }
        }   
                return "nao";
    }
}
