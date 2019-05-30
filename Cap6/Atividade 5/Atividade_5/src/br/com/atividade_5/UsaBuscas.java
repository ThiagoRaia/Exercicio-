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
public class UsaBuscas {
    public void UsaBuscas(){
        Buscas B = new Buscas(); 
        int []vetor={1,5,9,7,2,6};
        String []Palavra={"sexo","Feminino","Masculino"};
        System.out.println(B.BuscaNumero(85, vetor));
         System.out.println(B.BuscaPalavra(Palavra));
    }
}
