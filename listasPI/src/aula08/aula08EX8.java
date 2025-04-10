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
public class aula08EX8 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 11");
        String meses = s.next();
        
        switch(meses){
            case "0":
                System.out.println("JANEIRO");
                
            case "1":
                System.out.println("FEVEREIRO");
                
            case "2":
                System.out.println("MARÇO");
                
            case "3":
                System.out.println("ABRIL");
                
            case "4":
                System.out.println("MAIO");
                
            case "5":
                System.out.println("JUNHO");
                
            case "6":
                System.out.println("JULHO");
                
            case "7":
                System.out.println("AGOSTO");
                
            case "8":
                System.out.println("SETEMBRO");
                
            case "9":
                System.out.println("OUTUBRO");
                
            case "10":
                System.out.println("NOVEMBRO");
                
            case "11":
                System.out.println("DEZEMBRO");
                
        }
        
        
    }
}
