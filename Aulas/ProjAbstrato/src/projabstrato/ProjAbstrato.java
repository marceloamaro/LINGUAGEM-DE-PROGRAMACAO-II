/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projabstrato;

/**
 *
 * @author Erlanio Freire
 */
public class ProjAbstrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Horista h = new Horista(25, 100, "MARCELO", "MOREIRA", "2311231");
        h.exibir();
        System.out.println("==============================");
        
        Comissionado c = new Comissionado(1000, 20, "PEDREGUNDO", "DA SILVA", "34223");
        c.exibir();
        
        System.out.println("==============================");
        Assalariado a = new Assalariado(1500, "ILANA", "MERCULANA", "12312");
        a.exibir();
    }
    
}


/*
método abstrato exibirEmpregado();
ASSALARIADO
JOÃO DA SILVA RECEBE UM SALÁRIO DE 1400 REAIS
E POSSUÍ O CPF 123123

COMISSIONADO
JOÃO DA SILVA RECEBE UM SALÁRIO DE 1400 REAIS
E POSSUÍ O CPF 123123
SUA VENDA TOTAL FOI: 1500
SUA TAXA DE COMISSÃO FOI: 5.0

HORISTA
JOÃO DA SILVA RECEBE UM SALÁRIO DE 1400 REAIS
E POSSUÍ O CPF 123123
VALOR DA HORA: 25
TOTAL DE HORAS TRABALHADAS: 100
*/