package controle_alunos_escola;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("12345-6", "Wellington", 10.0);
        aluno1.exibir();

        aluno1.setNota(11.5);
        aluno1.exibir();
    }
}
