package sistema_gestao_escolar;

public class Disciplina {
    public String nome;
    public int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void emitirBoletim(Aluno aluno) {
        System.out.println("=== Boletim ===");
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        aluno.exibir();
    }

    public void exibir() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
    }
}

