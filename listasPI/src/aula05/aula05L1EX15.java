/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula05L1EX15 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        double n = s.nextDouble();
        
        double quadrado = Math.pow(n,2);
        double raiz = Math.sqrt(n);
        
        System.out.println("O quadrado é = " + quadrado + "\n" +"Sua raiz é = " + raiz);
        
        
        
        
    }
    
}
