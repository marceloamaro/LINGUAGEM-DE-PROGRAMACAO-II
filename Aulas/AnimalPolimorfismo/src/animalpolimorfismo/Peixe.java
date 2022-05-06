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
public class Peixe extends Animal{
    private int qtdNadadeiras;

    public Peixe(int qtdNadadeiras, String cor, double tamanho) {
        super(cor, tamanho);
        this.qtdNadadeiras = qtdNadadeiras;
    }

    public int getQtdNadadeiras() {
        return qtdNadadeiras;
    }

    public void setQtdNadadeiras(int qtdNadadeiras) {
        this.qtdNadadeiras = qtdNadadeiras;
    }
    
    @Override
    public void locomover(){
        System.out.println("O peixe nada!");
    }
    
    @Override
    public void exibir(){
      super.exibir();
        System.out.println("Quantidade de Nadadeiras: " + this.getQtdNadadeiras());
    }
}
