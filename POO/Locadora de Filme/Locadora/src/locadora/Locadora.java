package locadora;


public class Locadora {

    
    public static void main(String[] args) {
        Filme alugar = new Filme("HOMEM ARANHA ");
        alugar.exibirFilme();
        alugar.calcularPreco();
        
        Filme alugar1 = new Filme("THE BATMAN ");
        alugar1.exibirFilme();
        alugar1.calcularPreco();
        
    }
    
}