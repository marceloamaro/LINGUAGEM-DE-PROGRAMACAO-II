
package entrada;


public class IngressoVip extends Ingresso {

    public IngressoVip() {
        this.valor = (float) (this.valor + 10.00);
    }

   public float getValorVip() {
        return valor;
    }

    public void setValorVip(float valor) {
        this.valor = valor;
    }
    
}

