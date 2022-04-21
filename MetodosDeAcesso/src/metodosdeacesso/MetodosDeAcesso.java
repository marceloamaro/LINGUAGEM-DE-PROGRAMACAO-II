/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeacesso;

/**
 *
 * @author Erlanio Freire
 */
public class MetodosDeAcesso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("erlanio");
        p1.setIdade(25);
        System.out.println("Idade: "+ p1.getIdade());
        System.out.println("Idade nova:" + p1.envelhecer(10));
    }

}
