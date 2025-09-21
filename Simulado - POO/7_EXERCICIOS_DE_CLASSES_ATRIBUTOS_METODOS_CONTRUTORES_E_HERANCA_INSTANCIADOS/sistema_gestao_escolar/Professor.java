package sistema_gestao_escolar;

public class Professor extends Pessoa {

    public double salario;
    public String disciplina;

    public Professor(String nome, String cpf, double salario, String disciplina) {
        super(nome, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void registrarNota(Aluno aluno, double nota) {
        aluno.adicionarNota(nota);
    }

    public void exibir() {
        super.exibir();
        System.out.println("Salário: R$" + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}

