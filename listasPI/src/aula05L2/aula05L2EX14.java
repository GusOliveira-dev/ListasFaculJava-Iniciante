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
public class aula05L2EX14 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro");
        int n1 = s.nextInt();
        
        System.out.println("Digite outro número inteiro");
        int n2 = s.nextInt();
        
        int quo = n1/n2;
        int res = n1%n2;
        
        System.out.println("O quociente dessa divisão é: " + quo + "\n"
                           +"O resto dessa divisão é: " + res);
        
        
        
    }
    
}
