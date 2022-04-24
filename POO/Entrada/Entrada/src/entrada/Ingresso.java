/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrada;

/**
 *
 * @author Note
 */
public class Ingresso {
 float valor = (float) 30.00;
    
    public void imprimirValor(){
        System.out.println("O valor é: " + valor);
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}
