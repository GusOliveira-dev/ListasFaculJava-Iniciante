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
public class aula10EX5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int contador = 1;
        
        while(contador <= 5){
            System.out.println("Digite o " + contador + " ° número");
            int n = s.nextInt();
            
            if (n%2 == 0) {
                System.out.println("O número é par." + "\n");
            }
            else{
                System.out.println("O número é ímpar." + "\n");
            }
            contador++;
        }
    }
}
