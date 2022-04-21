/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao04;

import java.util.Scanner;

/**
 *
 * @author Erlanio Freire
 */
public class Questao04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner en = new Scanner(System.in);
       
       TrocaNumero troca01 = new TrocaNumero();
        System.out.println("Informe um valor para o NUMA: ");
        int numA = en.nextInt();
        System.out.println("Informe um valor par ao NUMB: ");
        int numB = en.nextInt();
        troca01.inverteValores(numA, numB);
    }
    
}
