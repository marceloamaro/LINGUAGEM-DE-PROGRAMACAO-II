
package veiculo;


public class Caminhao extends Carro{
    private int eixos;

    public Caminhao(int eixos, String modelo, String placa, int ano) {
        super(modelo, placa, ano);
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixo) {
        this.eixos = eixos;
    }
    public void exibirCaminhao() {
        System.out.println(""
                + "\nCAMINHAO"
                + "\nQTD EIXOS: " + this.getEixos()
                + "\nMODELO: " + this.getModelo()
                + "\nPLACA: " + this.getPlaca()
                + "\nANO: " + this.getAno()
                + "\n");
    }
}
