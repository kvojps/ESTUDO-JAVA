package Java.CaracteristicasDaLinguagem.Enums;

public enum Status {
    OPEN(13, "ABERTO"),
    CLOSE(2, "FECHADO");

    private final int cod;
    private final String texto;

    Status(final int cod, final String texto) {
        this.cod = cod;
        this.texto = texto;
    }

    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}
