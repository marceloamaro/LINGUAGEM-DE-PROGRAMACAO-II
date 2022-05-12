
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Eletronicos extends Produtos{
    private String tensao;
    private double consumoEnergia;

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    @Override
    public void exibirProduto(){
        super.exibirProduto();
        System.out.println("Tensao: " + this.getTensao()
                + "\nConsumo: " + this.getConsumoEnergia());
    }
    
    public void ligar(){
        System.out.println("O " + this.getNome() + " ligou!");
    }
    
    public void desligar(){
        System.out.println("O " + this.getNome() + " desligou!");
    }
    
    public double calcularConsumoDias(double consumoEnergia, int totalDias){
        return consumoEnergia * totalDias;
    }
    
    @Override
    public double calcularVenda(int quantidade, double preco){
        return quantidade * preco;
    }
}
