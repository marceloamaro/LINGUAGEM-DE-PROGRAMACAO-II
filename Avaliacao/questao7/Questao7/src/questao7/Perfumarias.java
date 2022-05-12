
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Perfumarias extends Produtos{
    private String tipoFrasco;
    private double ml;
    private String aroma;

    public String getTipoFrasco() {
        return tipoFrasco;
    }

    public void setTipoFrasco(String tipoFrasco) {
        this.tipoFrasco = tipoFrasco;
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
    
    @Override
    public double calcularVenda(int quantidade, double preco){
        return quantidade * preco;
    }
    
    @Override
    public void exibirProduto(){
        super.exibirProduto();
        System.out.println("Frasco: " + this.getTipoFrasco()
                + "\nML: " + this.getMl()
                + "\nAroma: " + this.getAroma());
    }
    
}

