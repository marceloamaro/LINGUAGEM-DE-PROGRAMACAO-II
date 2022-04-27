
package animal;


public class Peixe extends Animal1 {
    private int qntNadadeiras;

    public Peixe(int qntNadadeiras, String cor, double tamanho) {
        super(cor, tamanho);
        this.qntNadadeiras = qntNadadeiras;
    }

    public int getQntNadadeiras() {
        return qntNadadeiras;
    }

    public void setQntNadadeiras(int qntNadadeiras) {
        this.qntNadadeiras = qntNadadeiras;
    }
    
    @Override
    public void locomover(){
        System.out.println("O peixe nada");
    }
    
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("QNT DE NADADEIRA: " +this.getQntNadadeiras());
    }
}
