package Java.CaracteristicasDaLinguagem.TratamentoDeDatas.ClasseDate;

import java.util.Date;

public class Exemplo01 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);

    }
}
