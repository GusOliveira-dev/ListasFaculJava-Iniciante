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
public class aula05L2EX11 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual a base do terreno?");
        int base = s.nextInt();
        
        System.out.println("Qual a altura do terreno?");
        int altura = s.nextInt();
        
        System.out.println("Qual o preço do M²?");
        int preco = s.nextInt();
        
        int area = base*altura;
        int precom = area+preco;
        
        
        System.out.println("A área do terreno é: " + area);
        System.out.println("O preço do M² é: " + precom);
        
        
        
    }
    
}
