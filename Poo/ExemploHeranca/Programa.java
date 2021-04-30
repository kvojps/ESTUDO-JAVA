package Java.Poo.ExemploHeranca;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setQuantidadeDePortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("Fan");
        moto.setCilindradas("125");

        System.out.println(carro.mostrarVeiculo());
        System.out.println(moto.mostrarVeiculo());
    }
}
