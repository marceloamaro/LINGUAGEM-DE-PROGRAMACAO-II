/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao03;

/**
 *
 * @author Erlanio Freire
 */
public class Calcular {

    public void calcula() {
        int soma=0;
        long mult=1;
        
        for(int i=1; i<=30; i++){
            if(i % 2 == 0){
                mult *=i;
            }else{
                soma +=i;
            }
        }
        
        System.out.println("SOMA: "+ soma);
        System.out.println("Mult: " + mult);
    }

}
