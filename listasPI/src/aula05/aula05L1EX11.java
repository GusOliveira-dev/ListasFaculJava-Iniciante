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
public class aula05L1EX11 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o 1° número: ");
        int n1 = s.nextInt();
        
        System.out.println("Digite o 2° número: ");
        int n2 = s.nextInt();
        
        System.out.println("A soma dos números é: " + (n1+n2));
        System.out.println("A diferença dos números é: " + (n1-n2));
        System.out.println("O protudo dos números é: " + (n1*n2));
        System.out.println("O quociente dos números é: " + (n1/n2));
        System.out.println("O resto da divisão dos números é: " + (n1%n2));
    }
}
