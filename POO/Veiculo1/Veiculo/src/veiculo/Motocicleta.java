
package veiculo ;


public class Motocicleta extends Carro {
    private int cilindradas;

    public Motocicleta(int cilindradas, String modelo, String placa, int ano) {
        super(modelo, placa, ano);
        this.cilindradas = cilindradas;
    }


    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    
    public void exibirMoto() {
        System.out.println(""
                + "\nMOTO"
                + "\nCILINDRADAS: " + this.getCilindradas()
                + "\nMODELO: " + this.getModelo()
                + "\nPLACA: " + this.getPlaca()
                + "\nANO: " + this.getAno()
                + "\n");
    }
}
