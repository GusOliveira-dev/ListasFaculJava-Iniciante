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
public class aula05L2EX7 {
    public static void main(String[]args){
           Scanner s = new Scanner(System.in);
           
           System.out.println("Qual a sua idade em anos?");
           int idade = s.nextInt();
           
           System.out.println("Qual a sua idade em meses?");
           int idadem = s.nextInt();
           
           System.out.println("Qual a sua idade em dias?");
           int idaded = s.nextInt();
           
           int idadedias = idade*365;
           
           System.out.println("Sua idade em dias é: " + idadedias);
                   
           
           
        
    }
    
}
