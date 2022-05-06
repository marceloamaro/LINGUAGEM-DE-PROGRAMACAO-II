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

    public void setAnosExperiencia(int anoExperiencia) {
        this.anosExperiencia = anoExperiencia;
    }

    public void exibirProfessor() {
        System.out.println(""
                + "Nome: " + this.getNome() + ""
                + "\nAno de Nascimento:" + this.getAnoNascimento() + ""
                + "\nSexo: " + this.getSexo() + ""
                + "\nIdade: " + this.getIdade());
    }   
    
    public void somarExperiencia(int anos){
        this.anosExperiencia +=  anos;
    }
    
    public void exibirAnosExperiencia(){
        System.out.println("ANOS DE EXPERIÊNCIA: " + this.getAnosExperiencia());
    }
    
    public void verificarAposentadoria(){
        if(this.getIdade() < 60){
            int faltamAnos = 60 - this.getIdade();
            System.out.println("FALTAM " + faltamAnos + " ANOS PARA SUA APOSENTADORIA!");
        }else{
            System.out.println("VOCÊ JÁ PODE APOSENTAR-SE");
        }
    }
    
}
