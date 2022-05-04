
package projetoabstrato;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Assalariado extends Empregado{
    private double salario;

    public Assalariado(double salario, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double vencimento() {
        return this.getSalario();
    }

    @Override
    public void exibir() {
        System.out.println(""
                +  this.getNome() 
                +" "
                +  this.getSobrenome() 
                + " CPF: " + this.getCpf()
                +  " RECEBE UM SALARIO DE R$: "
                + this.getSalario());  
    }
       
}