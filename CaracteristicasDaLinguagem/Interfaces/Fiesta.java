package Java.CaracteristicasDaLinguagem.Interfaces;

public class Fiesta implements Carro, Veiculo {
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "12ADJ13124";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();
    }
}
