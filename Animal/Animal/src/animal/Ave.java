
package animal;


public class Ave extends Animal1 {
    private double tamanhoBico;

    public Ave(double tamanhoBico, String cor, double tamanho) {
        super(cor, tamanho);
        this.tamanhoBico = tamanhoBico;
    }

    public double getTamanhoBico() {
        return tamanhoBico;
    }

    public void setTamanhoBico(double tamanhoBico) {
        this.tamanhoBico = tamanhoBico;
    }
    @Override
    public void locomover(){
        System.out.println("A ave voaa");
    }
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("TAMANDO DO BICO CM: " +this.getTamanhoBico());
    }
}
