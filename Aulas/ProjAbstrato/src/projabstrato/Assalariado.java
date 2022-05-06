/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projabstrato;

/**
 *
 * @author Erlanio Freire
 */
public class Assalariado extends Empregado {

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
        System.out.println(
                this.getNome()
                + " "
                + this.getSobrenome()
                + " RECEBE UM SALÁRIO DE : " + this.getSalario()
                + " E TEM O CPF: " + this.getCpf()
        );
    }
}
