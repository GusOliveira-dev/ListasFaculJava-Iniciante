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
public class aula07EX12 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        int n1 = s.nextInt();
        
        System.out.println("Digite a segunda nota: ");
        int n2 = s.nextInt();

        System.out.println("Digite a terceira nota: ");
        int n3 = s.nextInt();        
        
        int media = (n1+n2+n3)/3;
        
        if (media >= 8 && media <= 10) {
            System.out.println("NOTA A ");
        }
        else if (media >= 7 && media < 8) {
            System.out.println("NOTA B");
        }
        else if (media >= 5 && media < 7){
            System.out.println("NOTA C");
        }
        else if (media >= 4 && media < 5) {
            System.out.println("NOTA D");
        }
        else if (media >= 0 && media < 4) {
            System.out.println("NOTA E");
            
        }
    }
    
}
