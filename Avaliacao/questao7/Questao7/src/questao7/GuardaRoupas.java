
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class GuardaRoupas extends Moveis{
    private int qtdPortas;
    private int qtdGavetas;
    private String tipoPortas;

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdGavetas() {
        return qtdGavetas;
    }

    public void setQtdGavetas(int qtdGavetas) {
        this.qtdGavetas = qtdGavetas;
    }

    public String getTipoPortas() {
        return tipoPortas;
    }

    public void setTipoPortas(String tipoPortas) {
        this.tipoPortas = tipoPortas;
    }
    
    @Override
    public void exibirProduto(){
        super.exibirProduto();
        System.out.println("Quantidade de portas: " + this.getQtdPortas()
                + "\nQuantidade de gavetas: " + this.getQtdGavetas()
                + "\nTipo de portas: " + this.tipoPortas);        
    }
    
    @Override
    public double calcularVenda(int quantidade, double preco){
        return quantidade * preco;
    }
}

