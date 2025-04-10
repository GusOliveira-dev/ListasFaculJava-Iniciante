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
public class aula07EX7 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n1 = s.nextInt();
        
        System.out.println("Digite outro número:");
        int n2 = s.nextInt();
        
        if (n1 == n2) {
            System.out.println("Os números são iguais");
        }
        if (n1 != n2) {
            System.out.println("Os números  são diferentes");
        }
        if (n1 > n2) {
            System.out.println("O " + n1 + " é maior que " + n2);
        }
        if (n2 > n1) {
            System.out.println("O " + n2 + " é maior que " + n1);
        }
        if (n1 < 0 ) {
            System.out.println("O " + n1 + " é negativo");
        }
        if (n2 < 0) {
            System.out.println("O " + n2 + " é negativo");
        }
        if (n1%n2!=0) {
            System.out.println("Há resto de divisão");
        }
        
    }
    
}
