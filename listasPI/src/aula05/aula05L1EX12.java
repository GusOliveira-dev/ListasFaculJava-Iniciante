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
public class aula05L1EX12 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual é o raio?");
        double n1 = s.nextDouble();
        
        double a = 3.14*(n1*n1);
        
        System.out.println("A área do círculo é " + a);
        
        
        
    }
    
}
