/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05L2;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula05L2EX3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o 1° número:");
        int n1 = s.nextInt();
        
        System.out.println("Digite o 2° número:");
        int n2 = s.nextInt();
        
        System.out.println("Digite o 3° número:");
        int n3 = s.nextInt();
        
        int mul = n1 * n2 * n3;
        
        System.out.println("O produto é: " + mul);
        
        
    }
    
}
