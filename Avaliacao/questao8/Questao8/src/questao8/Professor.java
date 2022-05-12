
package questao8;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Professor extends Pessoa{
    private String matricula;
    private double valorHoraAula;
    private double qtdHorasMes;
    private String disciplinaMinistrada;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public double getQtdHorasMes() {
        return qtdHorasMes;
    }

    public void setQtdHorasMes(double qtdHorasMes) {
        this.qtdHorasMes = qtdHorasMes;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }
    
    @Override
    public void exibirPessoa(){
        super.exibirPessoa();
        System.out.println("Matricula: " + this.getMatricula()
                + "\nValor por hora aula: " + this.getValorHoraAula()
                + "\nQuantidades de horas por mes: " + this.getQtdHorasMes()
                + "\nDisciplina ministrada: " + this.getDisciplinaMinistrada());
    }
    
    public double calcularSalario(double valorHoraAula, double qtdHorasMes){
        return qtdHorasMes * valorHoraAula;
    }
    
}

