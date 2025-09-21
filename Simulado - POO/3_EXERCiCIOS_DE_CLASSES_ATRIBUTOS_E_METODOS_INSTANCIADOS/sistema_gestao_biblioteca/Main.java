package sistema_gestao_biblioteca;

public class Main {
    public static void main(String[] args) {

        int diaAtual = 10;

        Usuario professor = new Usuario("Wellington", "Professor");
        professor.exibir(diaAtual);

        Usuario aluno = new Usuario("Matheus", "Aluno");
        aluno.exibir(diaAtual);

        Usuario visitante = new Usuario("Jairo", "Visitante");
        visitante.exibir(diaAtual);

    }
}
