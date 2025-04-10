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
public class aula07EX6 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n1 = s.nextInt();
        
        System.out.println("Digite outro número: ");
        int n2 = s.nextInt();
        
        if (n1 == 0 || n2 ==0) {
            System.out.println("Não existe divisão por zero.");
        }
        else{
            int divisao = n1/n2;
            System.out.println("A divisão de " + n1 + " por " + n2 + " é " + divisao);
        }
        
        
    }
    
}
