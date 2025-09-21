package sistema_gestao_escolar;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Lucas Silva", "123.456.789-00", "A123");
        Professor professor = new Professor("Marina Costa", "987.654.321-00", 5000.0, "Matemática");
        Disciplina disciplina = new Disciplina("Matemática", 80);

        professor.registrarNota(aluno, 8.5);
        professor.registrarNota(aluno, 7.0);
        professor.registrarNota(aluno, 9.0);

        disciplina.emitirBoletim(aluno);

        System.out.println("\n=== Professor ===");
        professor.exibir();
    }
}

