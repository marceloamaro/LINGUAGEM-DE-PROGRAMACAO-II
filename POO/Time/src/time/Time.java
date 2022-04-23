
package time;


public class Time {

  
    public static void main(String[] args) {
        Jogador marcelo = new Jogador("Marcelo", "Brasileiro", 1992, 1.75, 68, 'A');
        
        marcelo.calcularIdade(2022);
        marcelo.exibirJogador();
        marcelo.verificarAposentadoria();
        
        
        Jogador amaro = new Jogador("Amaro", "Franca", 2000, 1.90, 70, 'D');
        
        amaro.calcularIdade(2022);
        amaro.exibirJogador();
        amaro.verificarAposentadoria();
        
        Jogador assis = new Jogador("Assis", "Argentino", 2005, 1.70, 70, 'M');
        
        assis.calcularIdade(2022);
        assis.exibirJogador();
        assis.verificarAposentadoria();
    }
    
}
