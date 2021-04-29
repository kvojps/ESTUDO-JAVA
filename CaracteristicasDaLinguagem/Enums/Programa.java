package Java.CaracteristicasDaLinguagem.Enums;

public class Programa {
    public static void main(String[] args) {
        for (TipoVeiculo tipo : TipoVeiculo.values()) {
            System.out.println("Tipo: " + tipo);
        }
        System.out.println("Código do Status CLOSE " + Status.CLOSE.getCod());
        System.out.println("Código do Status OPEN " + Status.OPEN.getCod());
    }
}
