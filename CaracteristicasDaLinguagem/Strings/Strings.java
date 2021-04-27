package Java.CaracteristicasDaLinguagem.Strings;

public class  Strings {
    public static void main(String[] args) {
        var nome = "José";
        var sobrenome = "Júnior";
        final var nomeCompleto = nome + sobrenome;
        System.out.println(nome);
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Nome completo do cliente: "+ nomeCompleto);

        var string = " Eu programo em Java ";
        System.out.println("-----Métodos de String importantes-----");
        System.out.println("Char na posição: "+ string.charAt(5));
        System.out.println("Tamanho da String: "+ string.length());
        System.out.println("Sem Trim[" + string + "]");
        System.out.println("Com Trim[" + string.trim() + "]");
        System.out.println("Lower: " + string.toLowerCase());
        System.out.println("Upper: " + string.toUpperCase());
        System.out.println("Contém M?" + string.contains("m"));
        System.out.println("Contém X?" + string.contains("X"));
        System.out.println("Replace " + string.replace("J","&"));
        System.out.println("Equals: " + string.equals("Eu programo em python"));
        System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" EU PROGRAMO EM JAVA "));
        System.out.println("Substring(1,6)=" + string.substring(1,6));
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Estudo do Java".split(" "));
        System.out.println("Aula".concat(" de Java "));
        System.out.println("123559 asdasd qweqw".replaceAll("[0-8]", "%"));







    }
}
