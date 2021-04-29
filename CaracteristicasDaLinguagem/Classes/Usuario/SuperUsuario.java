package Java.CaracteristicasDaLinguagem.Classes.Usuario;

public class SuperUsuario {
    private final String login;
    private final String senha;

    public SuperUsuario(final String login, final String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {return login;}
    protected String getSenha() {return senha;}
}
