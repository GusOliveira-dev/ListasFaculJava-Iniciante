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
public class aula05L2EX12 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Qual o preço do litro da gasolina?");
        double precog = s.nextDouble();
        
        System.out.println("Qual o valor do pagamento?");
        double vlpagamento = s.nextDouble();
        
        double lgasolina = precog-vlpagamento;
        
        System.out.println("O motorista conseguiu colocar: " + lgasolina + "L em seu veículo");
        
        
    }
    
}
