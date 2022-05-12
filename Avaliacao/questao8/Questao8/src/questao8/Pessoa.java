
package questao8;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void exibirPessoa(){
        System.out.println("Nome: " + this.getNome()
                + "\nCPF: " + this.getCpf()
                + "\nTelefone: " + this.getTelefone()
                + "\nEmail: " + this.getEmail()
                + "\nEndereco: " + this.getEndereco());
    }
            
}