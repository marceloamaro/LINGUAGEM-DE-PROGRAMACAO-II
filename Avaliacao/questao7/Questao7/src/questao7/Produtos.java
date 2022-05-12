
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public abstract class Produtos {
    private String nome;
    private double preco;
    private String marca;
       
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void exibirProduto(){
        System.out.println(
                  "Nome: " + this.getNome()
                + "\nPreco: " + this.getPreco()
                + "\nMarca: " + this.getMarca());
    }
    
    public abstract double calcularVenda(int quantidade, double preco);
}

