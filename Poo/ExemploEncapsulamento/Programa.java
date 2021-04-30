package Java.Poo.ExemploEncapsulamento;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Júnior", 18, 07, 2002);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getDataNascimento());
        System.out.println("Idade: "+pessoa.calculaIdade());
    }
}
