/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoa;

/**
 *
 * @author Aluno
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String semestre;
    private String curso;

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

    public Aluno(String nome, int anoNascimento, char sexo, String naturalidade) {
        super(nome, anoNascimento, sexo, naturalidade);
    }
    
    public void verCurso(){
        System.out.println("O ALUNO" +
                this.getNome()+ "CURSO" + this.getCurso());
    }
    
    public void exibirAluno(){
        System.out.println("" 
        +"\nNome: " + this.getNome()
        +"\nSexo: " + this.getSexo()
        +"\nCidade: " + this.getNaturalidade()
        +"\nIdade: " + this.calcularIdade(2022)
        +"\nMatricula: " + this.getMatricula()
        +"\nSemetre: " + this.getSemestre()
        );
    }
}
