/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalabs;

/**
 *
 * @author Erlanio Freire
 */
public class Felino extends Animal{

    @Override
    public void fazBarulho() {
        System.out.println("Felino fez barulho");
    }

    @Override
    public void procuraComida() {
        System.out.println("Felino procura comida");
    }
    
}
