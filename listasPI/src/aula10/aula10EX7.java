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
public class aula10EX7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + " número");
            int n = s.nextInt();
            soma+=n;
        }
            
        System.out.println("Soma: " + soma);
    }
}
