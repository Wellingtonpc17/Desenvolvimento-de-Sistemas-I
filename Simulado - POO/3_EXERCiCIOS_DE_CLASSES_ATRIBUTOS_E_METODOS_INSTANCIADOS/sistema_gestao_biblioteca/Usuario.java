package sistema_gestao_biblioteca;

public class Usuario {

    public String nome;
    public String tipoUsuario;

    public Usuario(String nome, String tipoUsuario) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public int calcularPrazoDevolucao(int diaAtual) {
        int diasAdicionar;

        if (tipoUsuario.equalsIgnoreCase("Professor")) {
            diasAdicionar = 30;
        } else if (tipoUsuario.equalsIgnoreCase("Aluno")) {
            diasAdicionar = 15;
        } else {
            diasAdicionar = 7;
        }

        return diaAtual + diasAdicionar;
    }

    public void exibir(int diaAtual) {
        System.out.println("-----Usuario---------");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Usuário: " + tipoUsuario);
        System.out.println("Prazo de Devolucao: Dia " + calcularPrazoDevolucao(diaAtual));
    }
}
