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
public class aula05L2EX17 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        
        //5 dias por semana, 45 semanas por ano; 5*45=225 dias
        
        System.out.println("Qual a distância em M da sua casa até o trabalho?");
        double m = s.nextDouble();
        
        double distancia = m*225;
        
        System.out.println("Você percorre " + distancia + "M por ano indo a pé ao seu trabalho");
        
        
        
    }
    
}
