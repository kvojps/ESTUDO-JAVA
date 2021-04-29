package Java.CaracteristicasDaLinguagem.ModificadorAbstract;

public class Quadrado extends FormaGeometrica {
    private final String nome;
    private final double area;

    public Quadrado(final String nome, final double area) {
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome() {
        return nome;
    }

    @Override
    public double area() {
        return area;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder()//
                .append("Quadrado [")//
                .append("nome=\"")//
                .append(nome).append("\"")//
                .append(",area=")//
                .append(area)//
                .append("]");
        return builder.toString();
    }
}
