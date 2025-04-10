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
public class aula07EX4 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("======= QUIZ DO NARUTO =======" + "\n" + "\n" + 
                "São membros da Akatsuki: " + "\n" + 
                "A: Naruto, Sasuke e Sakura" +
         "\n" + "B: Kakashi, Might Guy e Asuma" + "\n" + 
                "C: Shikamaru, Chouji e Ino" 
       + "\n" + "D: Tobi, Nagato e Sasori" + "\n" + 
                "E: Hashirama, Tobirama e Hiruzen" + "\n" + "\n" +
                "Digite a opção correta: ");
        String opcao = s.next();
        
        if (opcao.equals("D") || opcao.equals("d")) {
            System.out.println("Opção correta!");
        }
        else{
            System.out.println("Opção errada!");
        }
        
        
        
        
    }
}
