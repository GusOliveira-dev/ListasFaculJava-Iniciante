/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;
/**
 *
 * @author GUSTAVO
 */
public class aula10EX4 {
    public static void main(String[] args) {
        
        int contador = 1;
        
        while(contador <= 20){
            int num = (int) Math.pow(contador, 2);
            System.out.println(contador + " - " + num);
            contador++;
        }
    }
}
