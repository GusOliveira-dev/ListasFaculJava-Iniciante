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
public class aula05L2EX8 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Qual a sua idade em dias?");
        int idaded = s.nextInt();
        
        int anos = idaded/365;
        int meses = (idaded/365)*12;
        
        System.out.println("Sua idade em anos é: " + anos + "\n"
                           +"Sua idade em meses é: " + meses + "\n"
                            +"Sua idade em dias é: " + idaded);
        
       
        
        
    }
    
}
