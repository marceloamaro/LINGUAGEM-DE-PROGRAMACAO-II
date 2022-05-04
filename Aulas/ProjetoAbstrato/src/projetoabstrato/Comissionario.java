
package projetoabstrato;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Comissionario extends Empregado {
    private double totalVenda;
    private double taxaComissao;

    public Comissionario(double totalVenda, double taxaComissao, String nome, String sobrenome, String cpf) {
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
        double salario = (this.getTotalVenda()/100)*this.getTaxaComissao();
        return salario;
    }

    @Override
    public void exibir() {
        System.out.println(""
                +  this.getNome() 
                +" "
                +  this.getSobrenome() 
                + " CPF: " + this.getCpf()
                +  " RECEBE UM SALARIO DE R$: " + this.vencimento()
                +" SUA VENDA TOTAL FOI: " + this.getTotalVenda()
                +" SUA TAXA DE COMISSAO FOI: " + this.getTaxaComissao());
    }
}
