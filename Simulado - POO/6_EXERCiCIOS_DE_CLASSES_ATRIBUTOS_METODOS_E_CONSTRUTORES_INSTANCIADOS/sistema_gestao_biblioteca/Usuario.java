package sistema_gestao_biblioteca;

public class Usuario {

    public String nome;
    public String tipoUsuario;

    public Usuario(String nome, String tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public int calcularPrazoDevolucao() {
        if (tipoUsuario.equals("aluno")) {
            return 7;
        } else if (tipoUsuario.equals("professor")) {
            return 30;
        } else if (tipoUsuario.equals("visitante")) {
            return 3;
        } else {
            return 0;
        }
    }

    public void exibir() {
        int prazo = calcularPrazoDevolucao();
        System.out.println(nome + " - Prazo: " + prazo + " dias");
    }
}

