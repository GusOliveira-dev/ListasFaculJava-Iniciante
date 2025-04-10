/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula08EX6 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("1. Cadastro" + "\n"
                          +"2. Consulta" + "\n"
                          +"3. Sair");
        
        System.out.println("Digite a opção:");
        String op = s.next();
        
          switch(op){
              case "1":
                  System.out.println("Você está no cadastro.");
                  break;
                  
              case "2":
                  System.out.println("Você está na consulta.");
                  break;
                  
              case "3":
                  System.out.println("Saindo");
                  break;
                  
              default:
                  System.out.println("Opção inválida.");
                  break;
        }
    }
}
