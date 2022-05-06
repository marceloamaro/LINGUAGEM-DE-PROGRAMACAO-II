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
public abstract class Animal {

    private String nome;
    private int idade;
    private boolean doente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
    }

    public void dorme() {
        System.out.println("DORMIU!");
    }

    public abstract void fazBarulho();

    public abstract void procuraComida();
}
