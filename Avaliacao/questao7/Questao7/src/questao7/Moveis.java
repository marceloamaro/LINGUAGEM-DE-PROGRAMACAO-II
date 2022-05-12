
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public abstract class Moveis extends Produtos {
    private String material;
    private double largura;
    private double altura;
    private double comprimento;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    
    @Override
    public void exibirProduto(){
        super.exibirProduto();
        System.out.println("Material: " + this.getMaterial()
                + "\nLargura: " + this.getLargura()
                + "\nAltura: " + this.getAltura()
                + "\nComprimento: " + this.getComprimento());
    }   
    
}

