package Java.CaracteristicasDaLinguagem.ModificadorAbstract;

public class Programa {
    public static void main(String[] args) {
        final FormaGeometrica quadrado = new Quadrado("quadrado",10.0);
        System.out.println(quadrado);

        System.out.println(quadrado.desenha(18,07));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
