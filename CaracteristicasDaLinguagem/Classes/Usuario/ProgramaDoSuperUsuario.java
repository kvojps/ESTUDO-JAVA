package Java.CaracteristicasDaLinguagem.Classes.Usuario;

public class ProgramaDoSuperUsuario {
    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "12345");
        System.out.println(superUsuario.getLogin());
        System.out.println(superUsuario.getSenha());

    }
}
