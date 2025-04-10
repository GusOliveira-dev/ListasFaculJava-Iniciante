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
public class aula08EX5 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite sua idade:");
        int idade = s.nextInt();
        
       if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("Voto facultativo");
        }
       
        if (idade >= 18 && idade < 70) {
            System.out.println("Voto obrigatório");
            System.out.println("Permissão legal para dirigir");
            System.out.println("Permissão legal para beber");
        }
        
     
        
        
        
        
    }
    
}
