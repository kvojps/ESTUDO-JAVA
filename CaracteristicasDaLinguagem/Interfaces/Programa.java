package Java.CaracteristicasDaLinguagem.Interfaces;

public class Programa {
    public static void main(String[] args) {
        final Gol gol = new Gol();
        System.out.println("Marca do carro : "+gol.marca());
        gol.ligar();

        final Fiesta fiesta = new Fiesta();
        System.out.println("Marca do fiesta: "+fiesta.marca());
        System.out.println("Registro do fiesta: "+fiesta.registro());
        fiesta.ligar();
    }
}
