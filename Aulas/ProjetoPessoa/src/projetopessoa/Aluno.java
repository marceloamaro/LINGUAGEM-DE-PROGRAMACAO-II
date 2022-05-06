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
public class Aluno extends Pessoa {

    private int matricula;
    private String semestre;
    private String curso;

    public Aluno(String nome, int anoNascimento, char sexo, String naturalidade) {
        super(nome, anoNascimento, sexo, naturalidade);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void verCurso() {
        System.out.println("O ALUNO "
                + this.getNome() + " CURSA: " + this.getCurso());
    }

    public void exibirAluno() {
        System.out.println(""
                + "\nNOME: " + this.getNome()
                + "\nSEXO: " + this.getSexo()
                + "\nCIDADE: " + this.getNaturalidade()
                + "\nIDADE: " + this.calcularIdade(2022)
                + "\nMATRÍCULA: " + this.getMatricula()
                + "\nSEMESTRE: " + this.getSemestre()
        );
    }
}
