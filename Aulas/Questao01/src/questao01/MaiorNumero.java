/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

/**
 *
 * @author Erlanio Freire
 */
public class MaiorNumero {
    
    public void exibirMaior(int num1, int num2){
        if(num1 > num2){
            System.out.println("O número: " + num1 + 
                                " é maior que o número: "+ num2);
        }else if(num2 > num1){
           System.out.println("O número: " + num2 + 
                                " é maior que o número: "+ num1); 
        }else{
            System.out.println("Os números são iguais!");
        }
    }
}
