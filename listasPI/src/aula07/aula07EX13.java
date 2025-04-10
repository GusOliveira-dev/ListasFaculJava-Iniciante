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
public class aula07EX13 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o 1° lado do triângulo");
        double lado1 = s.nextDouble();

        System.out.println("Digite o 2° lado do triângulo");
        double lado2 = s.nextDouble();

        System.out.println("Digite o 3° lado do triângulo");
        double lado3 = s.nextDouble();        
        
        if (lado1 == lado2 && lado1==lado3) {
            System.out.println("Três lados iguais = Equilátero");
        }
        else if (lado1 == lado2 || lado1==lado3) {
            System.out.println("Dois lados iguais = Isósceles");
        }
        else if (lado1 != lado2 && lado1 != lado3) {
            System.out.println("Três lados diferentes =  Escaleno");
        }
    }
    
}
