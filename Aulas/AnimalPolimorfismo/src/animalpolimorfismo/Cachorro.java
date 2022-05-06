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
public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String raca, String cor, double tamanho) {
        super(cor, tamanho);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void latir(){
        System.out.println("Au, au, au");
    }
    
   
    
    public void exibir(){
        super.exibir();
        System.out.println(""
                + "Raça: " + this.getRaca());
    }

    @Override
    public void locomover() {
        System.out.println("CORREU!");
    }
}
