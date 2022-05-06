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
public abstract class Animal {

    private String cor;
    private double tamanho;

    public Animal(String cor, double tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public abstract void locomover();

    public void exibir() {
        System.out.println(""
                + "\nCOR: " + this.getCor()
                + "\nTAMANHO: " + this.getTamanho());
    }
}
