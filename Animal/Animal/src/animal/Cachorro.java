
package animal;


public class Cachorro extends Animal1 {
    private String raca;

    public Cachorro(String raca, String cor, double tamanho) {
        super(cor, tamanho);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir(){
        System.out.println("Au, au, au");
    }
    @Override
    public void locomover(){
        System.out.println("O cachorro correu");
        
    }
    @Override
    public void exibir(){
        super.exibir();
        System.out.println("RAÇA: " +this.getRaca());
    }
    
   
}
