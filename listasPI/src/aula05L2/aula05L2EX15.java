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
public class aula05L2EX15 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a marca do celular");
        String marca = s.nextLine();
        
        System.out.println("Digite o modelo do celular");
        String modelo = s.nextLine();
        
        System.out.println("Digite o preço de fábrica do celular");
        double precof = s.nextDouble();
        
        double precoc = (precof+0.28)+(precof+0.20);
        
        System.out.println("Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Preço: " + precoc);
    
    
    
    }
}
