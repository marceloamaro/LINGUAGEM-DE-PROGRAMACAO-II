
package questao8;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Questao8 {

    public static void main(String[] args) {
        
        //Configurando as disciplinas
        Disciplina dis = new Disciplina();
        dis.setNome("Programacao Orientada a Objeto");
        dis.setCargaHoraria(60);
        
        System.out.println("\n======================================================================\n");
        Funcionario f = new Funcionario();
        f.setNome("Arnaldo");
        f.setCpf("12345678998");
        f.setTelefone("88 996584995");
        f.setEmail("arnaldo-ogatao@bol.com");
        f.setEndereco("Rua das Dores");
        f.setMatricula("1234564");
        f.setSalarioMes(600);
        f.setDepartamento("Escravo");                
        f.exibirPessoa();
        f.exibirSalario();
        f.pedirDemissao();
        
        System.out.println("\n======================================================================\n");
        Professor p = new Professor();
        p.setNome("Erlanio");
        p.setCpf("62345678998");
        p.setTelefone("88 999999995");
        p.setEmail("erlanio-da-hornet@bol.com");
        p.setEndereco("Rua Ernesto Vieira");
        p.setMatricula("1658945");
        p.setValorHoraAula(90);
        p.setQtdHorasMes(40);
        p.setDisciplinaMinistrada(dis.getNome());
        p.exibirPessoa();
        System.out.println("O salário do " + p.getNome() + " é de " + p.calcularSalario(p.getValorHoraAula(), p.getQtdHorasMes()) + " reais.");
        
        System.out.println("\n======================================================================\n");
        Aluno a = new Aluno();
        a.setNome("Marcelo");
        a.setCpf("92345678998");
        a.setTelefone("88 998888888");
        a.setEmail("marcko@bol.com");
        a.setEndereco("Rua das Pizzas");
        a.setMatricula("1625984");
        a.setSemestre(8);
        a.setCurso("Computacao");
        a.exibirPessoa();
        a.trancarDisciplina(dis.getNome());
        a.trancarCurso();
        
    }
    
}

