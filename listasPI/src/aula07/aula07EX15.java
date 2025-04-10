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
public class aula07EX15 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana");
        String dia = s.next();
        
        switch(dia){
            case "Domingo":
                System.out.println("1");
                break;
            case "Segunda":
                System.out.println("2");
                break;
            case "Terca":
                System.out.println("3");
                break;
            case "Quarta":
                System.out.println("4");
                break;
            case "Quinta":
                System.out.println("5");
                break;
            case "Sexta":
                System.out.println("6");
                break;
            case "Sabado":
                System.out.println("7");
                break;
            default:
                System.out.println("ERRO!");
                break;
        }
        
        
    }
    
}
