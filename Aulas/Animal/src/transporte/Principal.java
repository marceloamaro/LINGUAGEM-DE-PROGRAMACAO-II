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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro c = new Carro("AZUL", 4);
        c.setCombustivel("GASOLINA");
        c.setQtdPortas(4);
        c.exibir();
    }
    
}
