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
public class Carro extends Transporte{
    
    private int qtdPortas;
    private String combustivel;
    
    public Carro(String cor, int capacidade) {
        super(cor, capacidade);
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    
    @Override
    public void exibir(){
        System.out.println("COR: " + this.getCor() + 
                            "\nCAPACIDADE"+this.getCapacidade()+
                            "\nQUANTIDADE DE PORTAS: " + this.getQtdPortas()+
                            "\nCOMBUSTÍVEL: " + this.getCombustivel());
    }
    
}
