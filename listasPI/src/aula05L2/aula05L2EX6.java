/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05L2;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula05L2EX6 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Digite o nome do vendedor:");
        String nome = s.nextLine();
        
        System.out.println("Digite seu salário fixo:");
        double sf = s.nextDouble();
        
        System.out.println("Infome o total de vendas no mês");
        int vendas = s.nextInt();
        
        double total = (vendas*0.15)+sf;
        
        System.out.println(nome + " o total a receber este mês é R$" + total);
        
        
        
        
        
        
    }
    
}
