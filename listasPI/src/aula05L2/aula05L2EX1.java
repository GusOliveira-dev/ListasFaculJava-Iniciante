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
public class aula05L2EX1 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a 1° nota");
        double n1 = s.nextDouble();
        
        System.out.println("Digite a 2° nota");
        double n2 = s.nextDouble();
        
        System.out.println("Digite a 3° nota");
        double n3 = s.nextDouble();
        
        double ma = ((n1+n2+n3)/3);
        
        System.out.println("A média aritmética foi de: " + ma);
    }
    
}
