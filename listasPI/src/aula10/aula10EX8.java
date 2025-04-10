/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula10EX8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int n = s.nextInt();
        
        for (int i = n; i > 0; i--) {
            if (i%2==0) {
                System.out.println(i);
            }
            
        }
        
    }
}

