
package predio;


public class Predio {

   
    public static void main(String[] args) {
        Elevador andar = new Elevador(0, 2, 2, 0);
        andar.Inicializar();
        andar.Entrar();
        andar.Entrar();
        andar.Sair();
        andar.Sair();
        andar.Entrar();
        andar.Subir();
        andar.Entrar();
        andar.Subir();
        andar.Descer();
        andar.Descer();
        andar.imprimir();
    }
    
}
