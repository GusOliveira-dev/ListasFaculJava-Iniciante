/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula07EX11 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento:");
        int ano = s.nextInt();
        
        System.out.println("Digite o ano atual:");
        int anoa = s.nextInt();
        
        int idade = anoa-ano;
        
        if (ano < 1900) {
            System.out.println("Ano inválido vampirão");
        }
        else{
            System.out.println("Sua idade é " + idade);
        }
        
        
    }
    
}
