/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrata;

/**
 *
 * @author Erlanio Freire
 */
public class Assalariado extends Funcionario{
    private double salario;

    public Assalariado(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public double vencimento() {
        return this.salario;
    }
    
    
}
