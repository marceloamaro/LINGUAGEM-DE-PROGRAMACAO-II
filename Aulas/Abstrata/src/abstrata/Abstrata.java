/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author Erlanio Freire
 */
public class Abstrata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Comissionado c = new Comissionado(1000, 20);
        System.out.println( c.vencimento());
    }
    
}
