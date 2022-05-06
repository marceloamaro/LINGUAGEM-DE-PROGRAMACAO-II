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
public class Comissionado extends Empregado {

    private double totalVenda;
    private double taxaComissao;

    public Comissionado(double totalVenda, double taxaComissao, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.totalVenda = totalVenda;
        this.taxaComissao = taxaComissao;
    }

    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double vencimento() {
        double salario = (this.getTotalVenda() / 100) * this.getTaxaComissao();
        return salario;
    }

    @Override
    public void exibir() {
        System.out.println(
                this.getNome()
                + " "
                + this.getSobrenome()
                + " RECEBE UM SALÁRIO DE : " + this.vencimento()
                + " E TEM O CPF: " + this.getCpf()
                + " SUA VENDA TOTAL FOI: " + this.getTotalVenda()
                + " SUA TAXA DE COMISSÃO FOI: " + this.getTaxaComissao()
        );
    }
}
