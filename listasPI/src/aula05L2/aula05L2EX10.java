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
public class aula05L2EX10 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a duração do evento em segundos");
        int seg = s.nextInt();
        
        int horas = seg/3600;
        int min = seg/60;
        
        System.out.println("A duração do evento em horas: " + horas + "\n"
                            +"A duração do evento e min: " + min + "\n"
                            +"A duração do evento em seg: " + seg);
        
        
        
        
        
    }
    
}
