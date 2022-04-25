
package veiculo;

public class Onibus extends Carro {
    private int assentos;

    public Onibus(int assentos, String modelo, String placa, int ano) {
        super(modelo, placa, ano);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    
    public void exibirOnibus() {
        System.out.println(""
                + "\nONIBUS"
                + "\nQTD ASSENTOS: " + this.getAssentos()
                + "\nMODELO: " + this.getModelo()
                + "\nPLACA: " + this.getPlaca()
                + "\nANO: " + this.getAno()
                + "\n");
    }
}
