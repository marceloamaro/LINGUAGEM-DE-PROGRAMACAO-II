
package veiculo;


public class Veiculo {

    
    public static void main(String[] args) {
        Carro gol = new Carro("GOL", "PMA-1213", 2015);
        gol.exibirCarro();
        Motocicleta fan = new Motocicleta(150, "FAN","PMM-0010", 2022);
        fan.exibirMoto();
        Caminhao truck = new Caminhao(2, "TRUCK","PKM-1010", 2002);
        truck.exibirCaminhao();
        Onibus volare = new Onibus(29, "VOLARE","PKK-2022", 2021);
        volare.exibirOnibus();
    }
    
}
