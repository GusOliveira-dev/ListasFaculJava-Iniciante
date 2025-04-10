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
public class aula05L2EX5 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o valor do lado?");
        double lado = s.nextInt();
        
        double perimetro = 4*lado;
        double area = Math.pow(lado, 2);
        
        System.out.println("O perímetro desse quadrado é de " + perimetro + "\n"
        + "A area desse quadrado é a de " + area);
        
    }
    
}
