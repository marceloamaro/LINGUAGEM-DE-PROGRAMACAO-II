/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancateste;

/**
 *
 * @author Erlanio Freire
 */
public class HerancaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor p = new Professor("João", 1980, 'M', "Aurora");
        p.calcularIdade(2022);
        p.setAnosExperiencia(20);
        
        p.exibirProfessor();
        p.exibirAnosExperiencia();
        p.somarExperiencia(10);
        p.exibirAnosExperiencia();
        p.verificarAposentadoria();
    }
    
}
