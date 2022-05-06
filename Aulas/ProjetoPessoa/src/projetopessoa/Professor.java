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
public class Professor extends Pessoa {

    private int matricula;
    private String nivelGraduacao;
    private int anosExperiencia;

    public Professor(String nome, int anoNascimento, char sexo, String naturalidade) {
        super(nome, anoNascimento, sexo, naturalidade);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void somarExperiencia(int anos) {
        this.setAnosExperiencia(getAnosExperiencia()+anos);
    }

    public void exibirProfessor() {
        System.out.println(""
                + "\nNome: " + this.getNome()
                + "\nSexo: " + this.getSexo()
                + "\nNaturalidade" + this.getNaturalidade()
                + "\nMatrícula: " + this.getMatricula()
                + "\nAno de Nascimento: " + this.getAnoNascimento()
                + "\nNível de Graduação: " + this.getNivelGraduacao()
                + "\nAnos de experiência: " + this.getAnosExperiencia()
                + "\nIdade: " + this.calcularIdade(2022));
    }

    public void exibirAnosExperiencia() {
        System.out.println("O PROFESSOR " + this.getNome()
                + " TEM " + this.getAnosExperiencia()
                + " ANOS DE EXPERIÊNCIA");
    }

    public void verificarAposentadoria() {
        int totalAnosAposentadoria = this.calcularIdade(2022) + this.getAnosExperiencia();
        if (this.getSexo() == 'M') {
            if (totalAnosAposentadoria < 90) {
                int faltam = (90 - totalAnosAposentadoria) / 2;
                System.out.println("FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA!");
            } else {
                System.out.println("VOCÊ JÁ PODE SE APOSENTAR");
            }
        } else if(this.getSexo() == 'F') {
            if (totalAnosAposentadoria < 85) {
                int faltam = (85 - totalAnosAposentadoria) / 2;
                System.out.println("FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA!");
            } else {
                System.out.println("VOCÊ JÁ PODE SE APOSENTAR");
            }
        }else{
            System.out.println("Ops! Sexo inválido");
        }
    }
    
    public void ministrarAula(){
        System.out.println("MINISTROU UMA AULA!");
    }
}
