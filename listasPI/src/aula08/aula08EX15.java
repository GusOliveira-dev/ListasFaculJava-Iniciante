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
public class aula08EX15 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = s.nextLine();
        
        System.out.println("Digite uma palavra:");
        String palavra = s.nextLine();
        
        int pos = frase.indexOf(palavra);
        
        if (pos > 0) {
            System.out.println("A palavra aparece na frase com posição:" + pos);
        }
        else{
            System.out.println("A palavra não aparece na frase");
        }
    }
    
}
