/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Mesas extends Moveis{
    private int qtdCadeiras;

    public int getQtdCadeiras() {
        return qtdCadeiras;
    }

    public void setQtdCadeiras(int qtdCadeiras) {
        this.qtdCadeiras = qtdCadeiras;
    }
    
    @Override
    public void exibirProduto(){
        super.exibirProduto();
        System.out.println("Quantidade de cadeiras: " + this.getQtdCadeiras());        
    }

    @Override
    public double calcularVenda(int quantidade, double preco){
        return quantidade * preco;
    }
}

