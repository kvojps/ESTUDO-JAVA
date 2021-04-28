package Java.CaracteristicasDaLinguagem.ModificadorStatic;

public class Programa {
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bipede";

        final Cachorro fila = new Cachorro();
        // Perceba que ambos os cães vão apresentar a zoologia bípede, devido ao static.
        System.out.println(pitbull.zoologia);
        System.out.println(fila.zoologia);

        System.out.println(Cachorro.late());
    }
}
