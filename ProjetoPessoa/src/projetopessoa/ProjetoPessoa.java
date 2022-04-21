package projetopessoa;

public class ProjetoPessoa {

    public static void main(String[] args) {
        Professor leonardo = new Professor("Leonardo", 1996, 'M', "Mombaça");
        
        leonardo.calcularIdade(2022);
        leonardo.setAnosExperiencia(5);
        leonardo.setMatricula(12345);
        leonardo.setNivelGraduacao("Mestre");
        leonardo.exibirProfessor();
        leonardo.verificarAposentadoria();
        
        
        Professor joao = new Professor("Maria", 1972, 'F', "Quixeramobim");
        joao.calcularIdade(2022);
        joao.setAnosExperiencia(20);
        joao.setMatricula(12346);
        joao.setNivelGraduacao("Doutor");
        joao.exibirProfessor();
        joao.verificarAposentadoria();
        
        
        Aluno marcelo = new Aluno("Marcelo",1992,'M', "Mombaca");
        marcelo.calcularIdade(2022);
        marcelo.setMatricula(123456);
        marcelo.setCurso("Computacao");
        marcelo.setSemestre("Oitavo Semestre");
        marcelo.exibirAluno();
        
    }
    
}