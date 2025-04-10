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
public class aula05L2EX2 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite o nome:");
        String nome = s.nextLine();
        
        System.out.println("Digite o estado civil:");
        String estadoC = s.nextLine();
        
        System.out.println("Digite o endereço:");
        String endereco = s.nextLine();
        
        System.out.println("Digite o telefone");
        String telefone = s.nextLine();
        
        System.out.println("FICHA DO CLIENTE" + "\n" + "Nome: " + nome + "\n"
                + "Estado Civil: " + estadoC + "\n"
                + "Endereço: " + endereco + "\n"
                + "Telefone: " + telefone + "\n");
        
    }
    
}
