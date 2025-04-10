/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;
import java.util.Scanner;
/**
 *
 * @author GUSTAVO
 */
public class aula05L1EX13 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota"); //peso 2
        int n1 = s.nextInt();
        
        System.out.println("Digite a segunda nota"); //peso 3
        int n2 = s.nextInt();
        
        System.out.println("Digite a terceira nota"); //peso 2
        int n3 = s.nextInt();
        
        System.out.println("Digite a quarta nota"); //peso 3
        int n4 = s.nextInt();
        
        int nSemestre = ((n1*2)+(n2*3)+(n3*2)+(n4*3))/10;
        
        System.out.println("Nota do semestre: " + nSemestre);
        
        
        
        
        
        
    }
}
