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
public class aula05L2EX20 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número de ponto flutuante");
        double n1 = s.nextDouble();
        
        System.out.println("Digite outro número de ponto flutuante");
        double n2 = s.nextDouble();
        
        double c = n1-n2;
        double d = Math.pow(n1, n2);
        double e = n2+(n1/2);
        double f = n1*n2;
        
        System.out.println("A: -" + n2);
        System.out.println("B: 1/" + n1);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("E: " + e);
        System.out.println("F: " + f);
    }
}
