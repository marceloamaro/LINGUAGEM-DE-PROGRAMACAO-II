
package predio;


public class Elevador {
  private int aAtual, totalAndares, capacidadeElevador, pessoasPresentes;

    public Elevador(int aAtual, int totalAndares, int capacidadeElevador, int pessoasPresentes) {
        this.aAtual = aAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasPresentes = pessoasPresentes;
    }

    public int getaAtual() {
        return aAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    //Inicializa 
    public void Inicializar() {
        this.capacidadeElevador = this.getCapacidadeElevador();
        this.totalAndares = this.getTotalAndares();
        System.out.println("Terreo do Predio.\nPorta do Elevador Aberta");
    }
    //Entra pessoa 
    public void Entrar() {
        if (this.pessoasPresentes < this.capacidadeElevador) {
            this.pessoasPresentes += 1;
            System.out.println("entrou uma pessoa");
            if (this.pessoasPresentes >= this.capacidadeElevador) {
                System.out.println("andar lotado");
            }
        } 
    }
    //Sai pessoa 
    public void Sair() {
        if (this.pessoasPresentes <= this.capacidadeElevador) {
            this.pessoasPresentes -= 1;
            System.out.println("saiu uma pessoa");
            if (this.pessoasPresentes < 1) {
                System.out.println("andar vazio");
            }
        }

    }
    //Sobe o andar 
    public void Subir() {
        if (this.aAtual < this.totalAndares) {
            this.aAtual += 1;
            System.out.println("subiu um andar");
            if (this.aAtual >= this.totalAndares) {
                System.out.println("Ultimo andar");
            }
        }
    }

    //Desce o andar 
    public void Descer() {
        if (this.aAtual <= this.totalAndares) {
            this.aAtual -= 1;
            System.out.println("desceu um andar");
            if (this.aAtual < 1) {
                System.out.println("voce esta no terreo do predio");
            }
        }
    }

    public void imprimir() {
        System.out.println(""
                + "\nAndar Atual: " + this.getaAtual()
                + "\nTotal de Andares: " + this.getTotalAndares()
                + "\nCapacidade: " + this.getCapacidadeElevador()
                + "\nPessoas Presentes: " + this.getPessoasPresentes()
        );
    }
}