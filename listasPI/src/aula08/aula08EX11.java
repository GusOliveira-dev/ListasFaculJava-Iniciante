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
public class aula08EX11 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um nome:");
        String nome = s.nextLine();
        
        String ultLet = nome.substring(nome.length()-1);
        
        System.out.println("A última letra desse nome é: " + ultLet);
        
        
    }
}
