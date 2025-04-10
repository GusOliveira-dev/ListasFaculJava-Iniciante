/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author GUSTAVO
 */
public class aula05L1EX7 {
    public static void main(String[]args){
        
        int primeira = 37%13;
        int segunda = (41/7);
        int terceira = (11%3%2);
        int quarta = (11%3/2);
        
        System.out.println("1°Operação: 37%13 = " + primeira); //11
        System.out.println("2°Operação: 41/7 = " + segunda);  //5
        System.out.println("3°Operação: 11%3%2 = " + terceira); //0
        System.out.println("4°Operação: 11%3/2 = " + quarta); //1
        
        
        boolean priOpera = primeira==11;
        boolean segOpera = segunda==5;
        boolean terOpera = terceira==0;
        boolean quaOpera = quarta==1;
        
        System.out.println("\n" + "Verificação: " + "\n" + priOpera + "\n" + segOpera
        + "\n" + terOpera + "\n" + quaOpera);
        
        
    }
}
