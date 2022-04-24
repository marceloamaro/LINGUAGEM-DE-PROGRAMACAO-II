
package locadora;

import java.util.Scanner;


public class Filme {
    private String titulo;
    private String categoria;
    private int preco = 4;
    Scanner scan = new Scanner(System.in);
    int op = 1;

    public Filme(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }    
         
    public void exibirFilme() {
        System.out.println(""
                + "\nTITULO: " + this.getTitulo()
                + "\n");
                
    }
    
    
    public void calcularPreco() {
        while (op !=4){
        System.out.println("ESCOLHA A CATERGORIA");
        System.out.println("1 - Lancamento");
        System.out.println("2 - Promocao");
        System.out.println("3 - Infantil");
        System.out.println("4 - Geral");
        System.out.println("\n");
      

        op = scan.nextInt();
        if(op==1){
        System.out.println("1 - Lancamento");
            for (int i=0; i<1; i++){
            int pTotal;
            pTotal = this.getPreco() + 3;
            System.out.println(""
                        +"\nTITULO: " + getTitulo()
                        +"\nVALOR DO FILME EM LANCAMENTO: "
                        + "\nR$: " + pTotal);
            
            }break;
            
        }
        if(op==2){
        System.out.println("2 - Promocao");
            for (int i=0; i<1; i++){
            int pTotal;
            pTotal = this.getPreco() - 2;
            System.out.println(""
                        +"\nTITULO: " + getTitulo()
                        +"\nVALOR DO FILME EM PROMOCAO:  "
                        + "\nR$: " + pTotal);
            
            }break;
            
        }
        if(op==3){
        System.out.println("3 - Infantil");
            for (int i=0; i<1; i++){
            int pTotal;
            pTotal = this.getPreco() + 2;
            System.out.println(""
                        +"\nTITULO: " + getTitulo()
                        +"\nVALOR DO FILME INFANTIL: "
                        + "\nR$: " + pTotal);
            
            }break;
            
        }
        if(op==4){
        System.out.println("3 - Geral");
            for (int i=0; i<1; i++){
            System.out.println(""
                        +"\nTITULO: " + getTitulo()
                        +"\nVALOR DO FILME LANCAMENTO: "
                        + "\nR$: " + this.getPreco() );
            
            }break;
            
        }
        else{
        System.out.println("Opção Invalida");
        
        }break;
        }
    }  
}
