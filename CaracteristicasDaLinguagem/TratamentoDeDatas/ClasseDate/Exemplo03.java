package Java.CaracteristicasDaLinguagem.TratamentoDeDatas.ClasseDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo03 {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        Date data = new Date(currentTimeMillis);

        Instant instant = data.toInstant();
        System.out.println(instant);
    }
}
