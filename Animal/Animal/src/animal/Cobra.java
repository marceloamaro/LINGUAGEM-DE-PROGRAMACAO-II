
package animal;


public class Cobra extends Animal1 {
    private boolean venenosa;

    public Cobra(boolean venenosa, String cor, double tamanho) {
        super(cor, tamanho);
        this.venenosa = venenosa;
    }

    public boolean isVenenosa() {
        return venenosa;
    }

    public void setVenenosa(boolean venenosa) {
        this.venenosa = venenosa;
    }
    @Override
    public void locomover(){
        System.out.println("A cobra rastejou");
    }
    
   @Override
    public void exibir(){
        super.exibir();
        if(isVenenosa()){
            System.out.println("E venonosa");
        }else{
            System.out.println("nao é venososa");
        }
    }
}
