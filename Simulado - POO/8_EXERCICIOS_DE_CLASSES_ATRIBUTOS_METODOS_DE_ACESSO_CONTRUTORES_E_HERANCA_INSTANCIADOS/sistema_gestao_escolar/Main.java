package sistema_gestao_escolar;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Lucas Oliveira", "123.456.789-00", "A123");
        Professor professor = new Professor("Marina Silva", "987.654.321-00", "Matemática");

        System.out.println("=== Aluno ===");
        aluno.exibir();

        System.out.println("\n=== Professor ===");
        professor.exibir();

        aluno.setMatricula("B456");
        professor.setMateria("Física");

        System.out.println("\n=== Dados Atualizados ===");
        aluno.exibir();
        professor.exibir();
    }
}

