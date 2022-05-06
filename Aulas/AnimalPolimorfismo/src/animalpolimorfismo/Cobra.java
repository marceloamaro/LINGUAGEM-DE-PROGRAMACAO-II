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
public class Cobra extends Animal{
    private boolean venenosa;

    public Cobra(boolean venenosa, String cor, double tamanho) {
        super(cor, tamanho);
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    
    @Override
    public void locomover(){
        System.out.println("A cobra rastejou");
    }
    
    public void exibir(){
        super.exibir();
        if(isVenenosa()){
            System.out.println("É VENENOSA");
        }else{
            System.out.println("NÃO É VENENOSA");
        }
    }
}
