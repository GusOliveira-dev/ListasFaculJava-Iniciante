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
public class aula08EX2 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o preço de etiqueta?");
        double preco = s.nextDouble();
        
        System.out.println("Qual a condição de pagamento? " + "\n" 
                      + "1 - À vista em dinheiro ou cheque" + 
                "\n" +  "2 - À vista no cartão de crédito" + "\n" +
                        "3 - Em duas vezes"
            + "\n" +    "4 - Em três vezes");
        String cond = s.next();
        
        switch(cond){
            case"1":
                System.out.println("Recebe 10% de desconto");
                double des = (preco*0.90);
                System.out.println("R$:" + des);
                break;
                case"2":
                    System.out.println("Recebe 15% de desconto");
                    double des2 = (preco*0.85);
                    System.out.println("R$:" + des2);
                    break;
                    case"3":
                        System.out.println("Preço normal de etiqueta sem juros");
                        System.out.println("R$:" + preco);
                        break;
                        case"4":
                            System.out.println("Preço normal de etiqueta mais juros de 10%");
                            double jur = preco*0.1*3;
                            break;
        }
    }
}
