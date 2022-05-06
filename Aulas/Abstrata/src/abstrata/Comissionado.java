/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author Erlanio Freire
 */
public class Comissionado extends Funcionario{

    private double totalVenda;
    private double taxaComissao;

    public Comissionado(double totalVenda, double taxaComissao) {
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
        double comissao = this.getTotalVenda() / 100 * this.getTaxaComissao();
        return comissao;
    }
    
}
