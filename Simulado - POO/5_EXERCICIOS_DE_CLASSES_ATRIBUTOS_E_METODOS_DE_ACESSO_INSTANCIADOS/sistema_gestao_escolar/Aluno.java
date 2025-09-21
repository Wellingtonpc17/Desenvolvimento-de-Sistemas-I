package sistema_gestao_escolar;

public class Aluno extends Pessoa {

    public String matricula;

    public String turma;

    public Aluno(String nome, String cpf, String dataNascimento, String matricula, String turma) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.turma = turma;
    }

    public void exibir() {
        System.out.println("-----Aluno------");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Matricula: " + matricula);
        System.out.println("Turma: " + turma);
    }
}
