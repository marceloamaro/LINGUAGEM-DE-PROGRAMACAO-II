/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaula;

/**
 *
 * @author Aluno
 */
public class PrimeiraAula {

    /**
     * @param args the command line arguments
     */
    Pessoa junior = new Pessoa();
    int idade = junior.calcularIdade(1990);
    System.out.println("Junior tem:" + idade + "Anos!");
    
    public static void main(String[] args) {
        int idade = 10;
        System.out.println("Olá, \nmundo!" + idade);
        
        if (idade < 18){
            System.out.println("Menor de idade.");
        }else{
            System.out.println("Maior de Idade.");
        }
        
        while(idade < 100){
            System.out.println("Tá vivo.");
            idade++;
            
        }
        
        for(int i=0; i<10; i++){
            System.out.println("Sou o número:" + i);
        }
    }
    
    
}
