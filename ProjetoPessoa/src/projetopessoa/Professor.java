package projetopessoa;

public class Professor extends Pessoa {

    private int matricula;
    private String nivelGraduacao;
    private int anosExperiencia;

    public Professor(String nome, int anoNascimento, char sexo, String naturalidade) {
        super(nome, anoNascimento, sexo, naturalidade);
    }

    public int somarExperiencia(int anos) {
        return this.getAnosExperiencia() + anos;
    }

    public void exibirProfessor() {
        System.out.println(""
                + "\nNome: " + this.getNome()
                + "\nSexo: " + this.getSexo()
                + "\nNaturalidade: " + this.getNaturalidade()
                + "\nMatricula: " + this.getMatricula()
                + "\nAno nascimento: " + this.getAnoNascimento()
                + "\nNível de experiencia: " + this.getNivelGraduacao()
                + "\nAnos de experiencia: " + this.getAnosExperiencia()
                + "\nIdade: " + this.calcularIdade(2022)
                + "\n");
    }
    
    public void exibirAnosExperiencia(){
        System.out.println("\nO profesosr " + this.getNome() + " tem " + this.getAnosExperiencia() + " anos de experiencia.\n");
    }
    

    // Getters & Setters------------------------------------------------------------------------------------
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

    public void verificarAposentadoria() {
        int totalAnosAposentadoria = this.calcularIdade(2022) + this.getAnosExperiencia();
        if (this.getSexo() == 'M') {
            if (totalAnosAposentadoria <= 90) {
                int faltam = 90 - totalAnosAposentadoria;
                System.out.println("FALTAM " + faltam 
                        + " ANOS PARA SUA APOSENTADORIA");
            }else{
                System.out.println("VOCE JA PODE SE APOSENTADORIA");
            }
        }else if (this.getSexo() == 'F') {
            if (totalAnosAposentadoria <= 85) {
                int faltam = 85 - totalAnosAposentadoria;
                System.out.println("FALTAM " + faltam 
                        + " ANOS PARA SUA APOSENTADORIA");
            }else{
                System.out.println("VOCE JA PODE SE APOSENTADORIA");
            }
        }else{
            System.out.println("OPS! SEXO INVALIDO");
        }
    }
}