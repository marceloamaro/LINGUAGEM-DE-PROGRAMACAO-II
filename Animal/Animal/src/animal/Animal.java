
package animal;


public class Animal {

   
    public static void main(String[] args) {
       System.out.println("\n=========CACHORRO========\n");
       Cachorro c = new Cachorro ("vira-lata", "azul", 0.50);
       c.locomover();
       c.exibir();
       
       System.out.println("\n=========COBRA========\n");
       Cobra c1 = new Cobra(true, "PRETA", 1.50);
       c1.locomover();
       c1.exibir();
       
       System.out.println("\n=========PEIXE========\n");
       Peixe c2 = new Peixe(3, "verde", 0.85);
       c2.locomover();
       c2.exibir();
       
       System.out.println("\n=========AVE========\n");
       Ave c3 = new Ave(0.15, "branco", 0.75);
       c3.locomover();
       c3.exibir();
    }
    
}
