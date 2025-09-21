package sistema_gestao_escolar;

public class Professor extends Pessoa {

    public String disciplina;

    public double salario;

    public Professor(String nome, String cpf, String dataNascimento, String disciplina, double salario) {
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void exibir() {
        System.out.println("-----Professor----");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salario: " + salario + " reais");
    }


}
