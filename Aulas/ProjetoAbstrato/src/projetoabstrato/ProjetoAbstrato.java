
package projetoabstrato;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class ProjetoAbstrato {

    
    public static void main(String[] args) {
        Assalariado joao = new Assalariado(1212, "Marcelo", "Amaro", "123.123123-76");
        joao.exibir();
        //System.out.println("Salario: " + joao.vencimento());
        //System.out.println("Nome: " + joao.getNome());
        //System.out.println("Sobrenome: " + joao.getSobrenome());
        //System.out.println("CPF: " + joao.getCpf());
        System.out.println("=====================================");
        Comissionario c = new Comissionario(5000, 5, "Paulo", "da silva", "123.765.986-45");
        //System.out.println(c.getNome() + " Recebe: " + c.vencimento());
        c.exibir();
        System.out.println("=====================================");
        Horista h = new Horista(25, 100, "Vale", "Sousa", "456.987.976-00");
        //System.out.println(h.getNome() + " Recebe: " + h.vencimento());
        h.exibir();
    }
    
}
