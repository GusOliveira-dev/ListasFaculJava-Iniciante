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
public class aula08EX4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um decimal:");
        double a = s.nextDouble();
        
        System.out.println("Digite outro decimal:");
        double b = s.nextDouble();
        
         if ( a == 0 || b == 0) {
            System.out.println("Número inválido");
        }
           else if (a > 0 && b > 0) {
            double soma = a+b;
            System.out.println("A soma dos números é " + soma);
        }
            else if (a < 0 && b < 0) {
            double sub = a-b;
            System.out.println("A subtração dos números é " + sub);
        }
            else if (a > 0 || b < 0 ) {
            double mul = a*b;
            System.out.println("A multiplicação dos números é " + mul);
        }
             else if (b > 0 || a < 0) {
            double mul = a*b;
            System.out.println("A multiplicação dos números é " + mul);
        }
    }
}
