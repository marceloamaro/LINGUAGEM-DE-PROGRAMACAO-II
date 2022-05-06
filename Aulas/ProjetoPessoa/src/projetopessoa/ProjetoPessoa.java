/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa;

/**
 *
 * @author Erlanio Freire
 */
public class ProjetoPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor leonardo = new Professor("LEONARDO", 1970, 'M', "MOMBAÇA");
        leonardo.calcularIdade(2022);
        leonardo.setAnosExperiencia(5);
        leonardo.setMatricula(1233);
        leonardo.setNivelGraduacao("MESTRE");
        leonardo.exibirProfessor();
        leonardo.falar();
        leonardo.ministrarAula();
        
        Aluno joaozinho = new Aluno("JOAOZINHO", 2015, 'M', "MOMBAÇA");
        joaozinho.setCurso("INFORMÁTICA");
        joaozinho.setMatricula(12321);
        joaozinho.setSemestre("2º SEMESTRE");
        joaozinho.exibirAluno();
        joaozinho.falar();
        
        /* Professor joao = new Professor("JOÃO", 1970, 'M', "FORTALEZA");
        joao.calcularIdade(2022);
        joao.setAnosExperiencia(20);
        joao.setMatricula(123554);
        joao.setNivelGraduacao("DOUTOR");
        joao.exibirProfessor();*/
    }

}
