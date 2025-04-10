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
public class aula07EX9 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto:");
        int vlp = s.nextInt();
        
        if (vlp < 20) {
            System.out.println("Lucro de 45%");
            double l1 = vlp * 0.45;
            System.out.println("Valor de venda R$" + l1);
        }
        else{
            System.out.println("Lucro de 30%");
            double l2 = vlp * 0.30;
            System.out.println("Valor de venda R$" + l2);
        }
        
    }
    
}
