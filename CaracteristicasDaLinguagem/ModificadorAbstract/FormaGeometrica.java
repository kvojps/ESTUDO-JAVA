package Java.CaracteristicasDaLinguagem.ModificadorAbstract;

public abstract class FormaGeometrica {
    public abstract String nome();

    public abstract double area();

    public String desenha(int x, int y) {
        return "Desenhando nas coordenadas (" + x + "," + y + ")";
    }
}
