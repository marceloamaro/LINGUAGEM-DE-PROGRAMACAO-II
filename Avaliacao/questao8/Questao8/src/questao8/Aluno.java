
package questao8;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Aluno extends Pessoa{
    private String matricula;
    private int semestre;
    private String curso;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public void exibirPessoa(){
        super.exibirPessoa();
        System.out.println("Matricula: " + this.getMatricula()
                + "\nSemestre: " + this.getMatricula()
                + "\nCurso: " + this.getCurso());
    }
    
    public void trancarDisciplina(String disciplina){
        System.out.println("O aluno " + this.getNome() + " trancou a disciplina " + disciplina);
    }
    
    public void trancarCurso(){
        System.out.println("O aluno " + this.getNome() + " do " + this.getSemestre() + " semestre, trancou o curso!");
    }
}

