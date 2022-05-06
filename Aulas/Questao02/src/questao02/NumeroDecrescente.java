/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao02;

/**
 *
 * @author Erlanio Freire
 */
public class NumeroDecrescente {
    
    public void decrescente(int num){
       /* while(num >= 0){
            System.out.println("\t"+num);
            num--;
        }*/
       
       for(int i = num; i>=0; i--){
           System.out.println(i);
       }
    }
}
