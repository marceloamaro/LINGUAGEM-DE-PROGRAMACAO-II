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
public class Entrada {

    
    public static void main(String[] args) {
        Ingresso normal = new Ingresso();
        normal.imprimirValor();
        
        IngressoVip vip = new IngressoVip();
        vip.imprimirValor();
    }
    
}
