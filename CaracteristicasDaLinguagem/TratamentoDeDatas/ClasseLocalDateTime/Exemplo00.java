package CaracteristicasDaLinguagem.E_Datas.ClasseLocalDateTime;

import java.time.LocalDateTime;

public class Exemplo00 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(agora);
        System.out.println(futuro);
    }
}
