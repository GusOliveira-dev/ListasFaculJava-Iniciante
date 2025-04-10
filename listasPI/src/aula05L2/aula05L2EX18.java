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
public class aula05L2EX18 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual a temperatura em C°?");
        double c = s.nextDouble();
        
        double f = c*1.8+32;
        double k = c+273.15;
        
        System.out.println("A temperatura em F: " + f 
                   +"\n" + "A temperatura em K: " + k);
        
        
        
        
    }
    
}
