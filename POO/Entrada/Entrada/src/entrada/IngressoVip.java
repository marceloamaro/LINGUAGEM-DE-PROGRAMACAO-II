
package entrada;


public class IngressoVip extends Ingresso {
    private double valorVip;
    
    public IngressoVip(double valor) {
        super(valor);
    }

    public double getValorVip() {
        return valorVip;
    }

    public void setValorVip(double valorVip) {
        this.valorVip = valorVip;
    }

    public IngressoVip(double valorVip, double valor) {
        super(valor);
        this.valorVip = valorVip;
    }
    
    
    
}
