package Java.Poo.ExemploConstrutores;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat","Palio",2021);
        carro.setVariante("Alguma coisa");

        System.out.println(carro.mostrarCarro());
    }
}
