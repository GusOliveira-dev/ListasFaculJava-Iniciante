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
public class aula07EX10 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a idade do nadador:");
        int idade = s.nextInt();
        
        if (idade >= 5 && idade <= 7) {
            System.out.println("INFANTIL A");
        }
        else if (idade >= 8 && idade <= 10) {
            System.out.println("INFANTIL B");
        }
        else if (idade >= 11 && idade <= 13) {
            System.out.println("JUVENIL A");
        }
        else if (idade >= 14 && idade <= 17) {
            System.out.println("JUVENIL B");
        }
        else if (idade >= 18) {
            System.out.println("SÊNIOR");
        }
        else{
            System.out.println("Idade não permitida");
        }
        
    }
}
