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
public class aula07EX3 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("==MENU PRINCIPAL==" + "\n" + "1 - Fim" + "\n"
        + "2 - Cadastro" + "\n" + "3 - Consulta" + "\n" + "Selecione uma opção:");
        String opcao = s.nextLine();
        
        switch(opcao){
            case "1":
                System.out.println("Fim do programa");
                break;
            case "2":
                System.out.println("Cadastro");
                break;
            case "3":
                System.out.println("Consulta");
                break;
            default:
                System.out.println("Selecione uma opção válida.");
            
        }
        
        
        
    }
    
}
