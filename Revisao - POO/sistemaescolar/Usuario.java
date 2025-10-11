package sistemaescolar;

public class Usuario extends Pessoa {
    private String login;

    public Usuario(String nome, String login) {
        super(nome);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void logar() {
        System.out.println(nome + " fez login com o usuário: " + login);
    }
}

