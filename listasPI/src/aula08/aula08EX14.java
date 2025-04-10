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
public class aula08EX14 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite uma frase:");
        String frase = s.nextLine();
        
        System.out.println("Digite uma palavra dessa frase:");
        String pFrase = s.nextLine();
        
        System.out.println("Digite com o que quer substituir:");
        String subFrase = s.nextLine();
        
        String sub = frase.replace(pFrase, subFrase);
        
        System.out.println(sub);
        
    }
    
}
