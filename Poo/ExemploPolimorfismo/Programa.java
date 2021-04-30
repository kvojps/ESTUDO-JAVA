package Java.Poo.ExemploPolimorfismo;

public class Programa {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setValorVenal(1000.0);
        System.out.println("Veículo: " + veiculo.calculaImposto());

        Carro carro = new Carro();
        carro.setValorVenal(1000.0);
        System.out.println("Carro: " + carro.calculaImposto());

        Moto moto = new Moto();
        moto.setValorVenal(1000.0);
        System.out.println("Moto: " + moto.calculaImposto());
    }
}
