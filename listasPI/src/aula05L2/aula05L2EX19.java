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
public class aula05L2EX19 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um inteiro:");
        int n1 =  s.nextInt();
        
        
        System.out.println("Digite outro inteiro:");
        int n2 =  s.nextInt();
        
        int porcentagem = (n1*100)/n2;
        
        System.out.println("A porcentagem de " + n2 + " por " + n1 + " é : " + porcentagem + "%");
        
        
    }
}
