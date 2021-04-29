package Java.CaracteristicasDaLinguagem.Classes.Carro;

public class Programa {
    public static void main(String[] args) {
        var carro = new Carro();
        carro.addPassageiros(4);
        carro.rmPassageiros(1);
        System.out.println("Quantidade de passageiros: " + carro.getQuantidadePessoas());
    }
}
