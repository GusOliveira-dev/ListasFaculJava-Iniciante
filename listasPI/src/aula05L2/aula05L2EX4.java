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
public class aula05L2EX4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o 1° número");
        double n1 = s.nextDouble();
        
        System.out.println("Digite o 2° número");
        double n2 = s.nextDouble();
        
        double cub = Math.pow(n1, 3);
        double cub2 = Math.pow(n2, 3);
        
        System.out.println("Os cubos são "+ "\n" + cub + "\n" + cub2 + "\n");
        System.out.println("E a soma dos cubos: " + cub+cub2);
        
        
    }
    
}
