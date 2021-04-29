package Java.CaracteristicasDaLinguagem.Classes.Carro;

public class Carro {
    private int quantidadePessoas = 0;

    public void addPassageiros(int numero) {
        quantidadePessoas += numero;
    }

    public void rmPassageiros(int numero) {
        quantidadePessoas -= numero;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
}
