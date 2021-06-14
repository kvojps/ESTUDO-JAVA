package CaracteristicasDaLinguagem.E_Datas.ClasseLocalTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class exemplo00 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(agora);
        System.out.println(maisUmaHora);
    }
}
