
package questao8;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Funcionario extends Pessoa{
    private String matricula;
    private double salarioMes;
    private String departamento;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public void setSalarioMes(double salarioMes) {
        this.salarioMes = salarioMes;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void exibirSalario(){
        System.out.println("O funcionario " + this.getNome() + " recebeu: " + this.getSalarioMes());
    }
    
    @Override
    public void exibirPessoa(){
        super.exibirPessoa();
        System.out.println("Matricula: " + this.getMatricula()
                + "\nDepartamento: " + this.getDepartamento());
    }
    
    public void pedirDemissao(){
        System.out.println("O funcionario " + this.getNome() + " se demitiu!");
    }
}

