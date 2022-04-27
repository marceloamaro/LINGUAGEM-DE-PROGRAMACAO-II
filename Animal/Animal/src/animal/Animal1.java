
package animal;


public class Animal1 {
   private String cor;
   private double tamanho;

    public Animal1(String cor, double tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void locomover(){
        System.out.println("O animal se locomovel");
    }
    
     public void exibir(){
        System.out.println(""
                +"COR: "+this.getCor()
                +"\nTAMANHO CM: "+this.getTamanho());
    }
}
