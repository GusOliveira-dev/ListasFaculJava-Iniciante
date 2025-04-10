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
public class aula08EX3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro:");
        int a = s.nextInt();
        
        System.out.println("Digite um valor inteiro:");
        int b = s.nextInt();
        
        System.out.println("Digite um valor inteiro:");
        int c = s.nextInt();
        
        if (a > b && a > c && b > c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if (b > a && b > c &&  a > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if (c > a && c > b && b > a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        
    }
    
}
