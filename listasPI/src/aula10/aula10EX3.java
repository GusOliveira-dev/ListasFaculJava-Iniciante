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
public class aula10EX3 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
                System.out.println("Digite um número:");
        int n = s.nextInt();

        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            if(n > 0 && n <= 10){
            soma += n;
            System.out.println(n + " x " + i + " = " + soma);
            }
            else{
                break;
            }
        }

    }
}
