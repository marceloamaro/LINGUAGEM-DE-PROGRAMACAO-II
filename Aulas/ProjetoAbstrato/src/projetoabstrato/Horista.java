
package projetoabstrato;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Horista extends Empregado {
    private double precoHora;
    private double horasTrabalhadas;

    public Horista(double precoHora, double horasTrabalhadas, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double vencimento() {
       return this.getHorasTrabalhadas() * this.getPrecoHora();
    }

    @Override
    public void exibir() {
        System.out.println(""
                +  this.getNome() 
                +" "
                +  this.getSobrenome() 
                + " CPF: " + this.getCpf()
                +" VALOR DA HORA: " + this.getPrecoHora()
                +" TOTAL DE HORAS TRABALHADO: " + this.getHorasTrabalhadas());
    }
    
}
