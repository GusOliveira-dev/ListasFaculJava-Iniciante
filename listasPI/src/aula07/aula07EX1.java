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
public class aula07EX1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n = s.nextInt();
        
        if (n > 0) {
            System.out.println("Número positivo");
        }
        else if (n < 0) {
            System.out.println("Número negativo");
        }
        else{
            System.out.println("Número 0");
        }
        
    }
    
}
