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
public class aula08EX10 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        String nome = s.nextLine();
        
        String priLetra = nome.substring(0,1);
        
        System.out.println("A primeira letra deste nome é: " + priLetra);
        
        
        
    }
    
}
