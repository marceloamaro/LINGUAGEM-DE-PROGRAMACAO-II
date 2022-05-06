/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author Erlanio Freire
 */
public class Transporte {
        
    private String cor;
    private int capacidade;

    public Transporte(String cor, int capacidade) {
        this.cor = cor;
        this.capacidade = capacidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public void exibir(){
        System.out.println("COR: " + this.getCor() + "\nCAPACIDADE"+this.getCapacidade());
    }
    
    
}
