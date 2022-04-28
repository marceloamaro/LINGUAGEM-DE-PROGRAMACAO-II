
package entrada;


public class IngressoVip extends Ingresso {
   private float vVip;  
   private float diferenca;
   
   @Override
   public void imprimirValor(){
    vVip = this.getValor() + 15.00f; 
    System.out.println("O valor do Ingresso VIP e R$: " + vVip);
    diferenca = vVip - this.getValor();
    System.out.println("A diferenca do Ingresso VIP para o normal eR$: " + diferenca);
    }
    
}