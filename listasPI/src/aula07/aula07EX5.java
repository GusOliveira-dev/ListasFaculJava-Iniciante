/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula07EX5 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o ano:");
        int ano = s.nextInt();
        
        if (ano%4==0) {
            System.out.println("Ano bissexto");
        }

        else{
            System.out.println("Ano não bissexto");
        }
        
        
        
    }
}
