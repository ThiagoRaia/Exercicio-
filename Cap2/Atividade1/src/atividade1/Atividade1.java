/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 *
 * @author THIAGO
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s = "";
        
        float base,altura,area;
        BufferedReader dado;
        try{
        System.out.println("Entre com o valor da base do triangulo: ");
        dado = new BufferedReader (new InputStreamReader(System.in));
        s = dado.readLine();
        base = Float.parseFloat(s);
        
         System.out.println("Entre com o valor da altura do triangulo: ");
        dado = new BufferedReader (new InputStreamReader(System.in));
         s = dado.readLine();
        altura = Float.parseFloat(s);
        
        area = base*altura;
        
        System.out.println("A area deste Triangulo eh: "+area);    
        } catch(IOException erro){
            System.out.println("Houve erro na entrada de dados"+erro.toString());
        } catch(NumberFormatException erro) {
            System.out.println("Houve erro na conversao"+erro.toString());
        }
        






    }
    
}
