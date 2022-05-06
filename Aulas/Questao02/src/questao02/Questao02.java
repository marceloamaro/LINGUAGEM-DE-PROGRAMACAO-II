/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;

import java.util.Scanner;


/**
 *
 * @author Erlanio Freire
 */
public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        NumeroDecrescente num1 = new NumeroDecrescente();
        
        System.out.println("Informe um número para decremantar!");
        int num = en.nextInt();
        num1.decrescente(num);
    }
    
}
