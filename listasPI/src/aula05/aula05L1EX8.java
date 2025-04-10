/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula05L1EX8 {
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        
        System.out.println("Informe um inteiro:");
        int n1 = s.nextInt();
        
        System.out.println("Informe o segundo inteiro:");
        int n2 = s.nextInt();
        
        System.out.println("Informe um número decimal:");
        float n1d = s.nextFloat();
        
        System.out.println("Informe o segundo decimal:");
        float n2d = s.nextFloat();
        
        System.out.println("Digite um valor de texto:");
        String txt1 = s.next();
        
        System.out.println("Digite o segundo valor de texto:");
        String txt2 = s.next();
        
        System.out.println("Valor do primeiro inteiro: " + n1);
        System.out.println("Valor do segundo inteiro: " + n2);
        System.out.println("Valor do primeiro decimal: " + n1d);
        System.out.println("Valor do segundo decimal: " + n2d);
        System.out.println("Valor do primeiro texto: " + txt1);
        System.out.println("Valor do segundo texto: " + txt2);
        
        
        
    }
    
}
