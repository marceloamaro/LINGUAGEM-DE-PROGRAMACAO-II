
package time;


public class Time {

  
    public static void main(String[] args) {
        Jogador marcelo;
        marcelo = new Jogador("Marcelo",1992, 'A', "Mombaca");
        
        marcelo.calcularIdade(2022);
        marcelo.setAltura(170);
        marcelo.setPeso(68);
        marcelo.exibirJogador();
        marcelo.verificarAposentadoria();
    }
    
}
