/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula10EX9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            
        String p ="";
        
        int car = p.length();
        
        do{
            
        System.out.println("Digite uma palavra de 6 carateres");
        p = s.next();
        
        car = p.length();
        
            
        }while(car<6);

        
        }
    }
    

