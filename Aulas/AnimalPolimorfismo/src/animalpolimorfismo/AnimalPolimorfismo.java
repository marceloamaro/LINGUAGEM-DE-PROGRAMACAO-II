/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalpolimorfismo;

/**
 *
 * @author Erlanio Freire
 */
public class AnimalPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        Cachorro c = new Cachorro("Vira-lata", "Azul", 0.50);
        c.locomover();
        c.exibir();
        System.out.println("\n============COBRA==========\n");
        
        Cobra c1 = new Cobra(true, "PRETA", 1.50);
        c1.locomover();
        c1.exibir();
     
        
        System.out.println("\n=============PEIXE==========\n");
        Peixe p1 = new Peixe(4, "BRANCO", 0.25);
        p1.locomover();
        p1.exibir();
    }
    
}
