/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula08EX13 {
     public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite algo:");
        String palavra = s.nextLine();
        
        String lMaius = palavra.toUpperCase();
        String lMinus = palavra.toLowerCase();
        
        System.out.println(palavra + " em maiúsculo é " + lMaius + "\n" +
                "e em minúsculo é " + lMinus);

         
    }
}
