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
public class aula07EX8 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro");
        int n1 = s.nextInt();
        
        System.out.println("Digite outro número inteiro");
        int n2 = s.nextInt();
        
        System.out.println("Digite a operação desejada: +, - , * ou /");
        String operacao = s.next();
        
        switch(operacao){
            case "+":
                int soma = n1+n2;
                System.out.println("A soma de " + n1 + " e " + n2 + " é " + soma);
                break;
                
            case "-":
                int sub = n1-n2;
                System.out.println("A subtração de " + n1 + " por " + n2 + " é " + sub);
                break;
                
            case "*":
                int mul = n1*n2;
                System.out.println("A multiplicação de " + n1 + " por " + n2 + " é " + mul);
                break;
            
            case "/":
                int div = n1/n2;
                System.out.println("A divisão de " + n1 + " por " + n2 + " é " + div);
                break;
        }
    }
    
}
