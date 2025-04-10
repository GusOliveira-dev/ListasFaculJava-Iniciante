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
public class aula05L2EX13 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual a base do triângulo?");
        double b = s.nextDouble();
        
        System.out.println("Qual a altura do triângulo?");
        double a = s.nextDouble();
        
        double areat = (a*b)/2;
        
        System.out.println("A área do triângulo é: " + areat);
        
        
    }
    
}
