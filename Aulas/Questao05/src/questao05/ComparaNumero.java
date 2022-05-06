/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao05;

/**
 *
 * @author Erlanio Freire
 */
public class ComparaNumero {
   int idade=10;
    public void comparaNumeros(int num1, int num2){
        if(num1 == num2){
            System.out.println("O NÚMERO:"+ num1 +
                                " E O NÚMERO: "+ num2 + " SÃO IGUAIS");
        }else{
            System.out.println("O NÚMERO:"+ num1 +
                                " E O NÚMERO: "+ num2 + " SÃO DIFERENTES");
            
            if(num1 > num2){
                 System.out.println("O NÚMERO: "+ num1 +
                                " É MAIOR QUE O NÚMERO: "+ num2);
            }else{
                System.out.println("O NÚMERO: "+ num1 +
                                " É MENOR QUE O NÚMERO: "+ num2);
            }
        }
    }
}
