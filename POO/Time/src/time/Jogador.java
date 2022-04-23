
package time;


public class Jogador {
    private String nome;
    private String nacionalidade;
    private int anoNascimento;
    private int altura;
    private int peso;
    private char posicao;

    public Jogador(String nome, String nacionalidade, int anoNascimento, int altura, int peso, char posicao) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }


     
    public void exibirJogador() {
        System.out.println(""
                + "\nNome: " + this.getNome()
                + "\nPosição: " + this.getPosicao()
                + "\nAno Nascimento: " + this.getAnoNascimento()
                + "\nNacionalidade: " + this.getNacionalidade()
                + "\nAltura: " + this.getAltura()
                + "\nPeso: " + this.getPeso()
                + "\nIdade: " + this.calcularIdade(2022)
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
                System.out.println("JOGADOR DE DEFESA "
                        + " FALTAM " + faltam
                        + "  ANOS PARA SUA APOSENTADORIA");
            } else {
                System.out.println(" VOCE JA PODE SE APOSENTADORIA");
            }
        } else if (this.getPosicao() == 'M') {
            if (totalAnosAposentadoria <= 38) {
                int faltam = 38 - totalAnosAposentadoria;
                System.out.println("JOGADOR DE MEIO CAMPO "
                        + " FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA ");
            } else {
                System.out.println(" VOCE JA PODE SE APOSENTADORIA ");
            }
        } else if (this.getPosicao()== 'A') {
            if (totalAnosAposentadoria <= 35) {
                int faltam = 35 - totalAnosAposentadoria;
                System.out.println(" JOGADOR DE ATAQUE "
                        + " FALTAM " + faltam
                        + " ANOS PARA SUA APOSENTADORIA ");
            } else {
                System.out.println(" VOCE JA PODE SE APOSENTADORIA ");
            }
        }else{
                System.out.println(" OPS! POSICAO INVALIDO ");
        }
    }    

}
