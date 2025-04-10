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
public class aula05L2EX9 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        double n1 = s.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double n2 = s.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double n3 = s.nextDouble();
        
        double mediap = ((n1*2)+(n2*3)+(n3*5))/10;
        
        System.out.println("A média final ponderada é de: " + mediap );
        
        
        
        
        
    }
    
}
