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
public class aula05L1EX14 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe a Base maior");
        double B = s.nextDouble();
        
        System.out.println("Informe a Base menor");
        double b = s.nextDouble();
        
        System.out.println("Informe a altura");
        double h = s.nextDouble();
        
        System.out.println("A área do trapézio é = " + ((B*b)*h)/2);
        
    }
    
}
