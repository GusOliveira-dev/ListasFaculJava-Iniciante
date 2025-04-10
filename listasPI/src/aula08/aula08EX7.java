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
public class aula08EX7 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int a = s.nextInt();
        
        System.out.println("Digite outro número:");
        int b = s.nextInt();
        
        System.out.println("Informe a operação: 1 –Somar, 2 –Subtrair, 3 –Múltiplicar, 4 –Dividir e 5 –Sair");
        String op = s.next();
        
        switch(op){
            case "1":
                int soma = a+b;
                System.out.println("A soma é " + soma);
                break;
                
            case "2":
                int sub = a-b;
                System.out.println("A subtração é" + sub);
                break;
            
            case "3":
                int mul = a*b;
                System.out.println("A multiplicação é " + mul);
                break;
                
            case "4":
                int divid = a/b;
                System.out.println("A divisão é " + divid);
                break;
                
            case "5":
                break;
        }
    }
    
}
