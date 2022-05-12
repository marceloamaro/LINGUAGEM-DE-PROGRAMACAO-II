
package questao7;

/**
 *
 * @author ϞAmaroₘⱼ
 */
public class Questao7 {

    public static void main(String[] args) {
        
        System.out.println("\n=================PERFUMARIA=================");
        Perfumarias p = new Perfumarias();
        p.setNome("N 5");
        p.setPreco(190);
        p.setMarca("Channel");
        p.setTipoFrasco("Vrido");
        p.setMl(50);
        p.setAroma("Doce");
        p.exibirProduto();        
        System.out.println("O preço total é de: " + p.calcularVenda(3, p.getPreco()));
        
        
        
        System.out.println("\n=================ELETRONICOS=================");
        Eletronicos e = new Eletronicos();
        e.setNome("Torradeira");
        e.setPreco(50);
        e.setMarca("Britania");
        e.setTensao("220V");
        e.setConsumoEnergia(10);
        e.exibirProduto();
        System.out.println("O consumo do(a) " + e.getNome() + " e de: " + e.calcularConsumoDias(e.getConsumoEnergia(), 5));
        System.out.println("O preço total é de: " + e.calcularVenda(3, e.getPreco()));
        
        
        
        System.out.println("\n=================MESAS=================");
        Mesas m = new Mesas();
        m.setNome("Eucalipto");
        m.setPreco(1200);
        m.setMarca("Bom Pastor");
        m.setAltura(85);
        m.setComprimento(120);
        m.setLargura(120);
        m.setMaterial("MDF");
        m.setQtdCadeiras(4);
        m.exibirProduto();
        System.out.println("O preço total é de: " + m.calcularVenda(3, m.getPreco()));
        
        
        
        System.out.println("\n=================GUARDA ROUPAS=================");
        GuardaRoupas g = new GuardaRoupas();
        g.setNome("Portas de correr");
        g.setPreco(2200);
        g.setMarca("Bom Pastor");
        g.setAltura(200);
        g.setComprimento(214);
        g.setLargura(70);
        g.setMaterial("MDF");
        g.setQtdGavetas(6);
        g.setQtdPortas(3);
        g.setTipoPortas("Correr");
        g.exibirProduto();
        System.out.println("O preço total é de: " + g.calcularVenda(3, g.getPreco()));
    }
    
}

