package Java.CaracteristicasDaLinguagem.TratamentoDeDatas.ClasseDate;

import java.util.Date;

public class Exemplo02 {
    public static void main(String[] args) {
        Date dataPassado = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        long currentTimeMillis = System.currentTimeMillis();
        Date dataRecente = new Date(currentTimeMillis);

        Date mesmaDataRecente = new Date(currentTimeMillis);

        boolean isAfter = dataPassado.after(dataRecente);
        System.out.println("Data é posterior: " + isAfter);

        boolean isBefore = dataPassado.before(dataRecente);
        System.out.println("Data é anterior: " + isBefore);

        boolean isEquals = dataRecente.equals(mesmaDataRecente);
        System.out.println("Datas iguais: " + isEquals);

        int compareCase1 = dataPassado.compareTo(dataRecente);
        System.out.println("Comparando datas: "+compareCase1);

        int compareCase2 = dataRecente.compareTo(dataPassado);
        System.out.println("Comparando datas: "+compareCase2);

        int compareCase3 = dataRecente.compareTo(mesmaDataRecente);
        System.out.println("Comparando datas: "+compareCase3);



    }
}
