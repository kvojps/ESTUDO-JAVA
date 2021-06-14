package CaracteristicasDaLinguagem.E_Datas.ClasseDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo01 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
