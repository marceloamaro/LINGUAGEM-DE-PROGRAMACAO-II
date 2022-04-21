
package time;


public class Jogador {
    private String nome;
    private int anoNascimento;
    private char posicao;
    private String nacionalidade;
    private double altura;

    public Jogador(String nome, int anoNascimento, char posicao, String nacionalidade, double altura, float peso) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.posicao = posicao;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    Jogador(String marcelo, int i, char c, String mombaca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    private float peso;


  
    
    public void exibirJogador() {
        System.out.println(""
                + "\nNome: " + this.getNome()
                + "\nPosição: " + this.getPosicao()
                + "\nAno Nascimento: " + this.getAnoNascimento()
                + "\nNacionalidade: " + this.getNacionalidade()
                + "\nAltura: " + this.getAltura()
                + "\nPeso: " + this.getPeso()
                + "\n");
    }
    
    public int calcularIdade(int anoAtual){
        return anoAtual - this.getAnoNascimento();
    }
    
    public void verificarAposentadoria() {
        int totalAnosAposentadoria = this.calcularIdade(2022);
        if (this.getPosicao() == 'D') {
            if (totalAnosAposentadoria <= 40) {
                int faltam = 40 - totalAnosAposentadoria;
                System.out.println("JOGADOR DE DEFESA"
                        + "FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA");
            } else {
                System.out.println("VOCE JA PODE SE APOSENTADORIA");
            }
        } else if (this.getPosicao() == 'M') {
            if (totalAnosAposentadoria <= 38) {
                int faltam = 38 - totalAnosAposentadoria;
                System.out.println("JOGADOR DE MEIO CAMPO"
                        + "FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA");
            } else {
                System.out.println("VOCE JA PODE SE APOSENTADORIA");
            }
        } else if (this.getPosicao()== 'A') {
            if (totalAnosAposentadoria <= 35) {
                int faltam = 35 - totalAnosAposentadoria;
                System.out.println("JOGADOR DE ATAQUE"
                        + "FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA");
            } else {
                System.out.println("VOCE JA PODE SE APOSENTADORIA");
            }
        }else{
                System.out.println("OPS! POSICAO INVALIDO");
        }
    }    

    void setAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAltura(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
