/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula08EX1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        boolean vl1 = true;
        boolean vl2 = false;
        
        
        System.out.println("Valor 1 é true ou false?");
        String r1 = s.next();
        
        System.out.println("Valor 1 é true ou false?");
        String r2 = s.next();
        
        if (r1.equals("true") && r2.equals("false")) {
            System.out.println(vl1);
        }
        else{
            System.out.println("incorreto");
        }
        
    }
}
