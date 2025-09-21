package sistema_gestao_pessoal_hospitalar;

public class Funcionario {

    public String nome;

    public String matricula;

    public double salario;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public void exibir() {
        System.out.println("------Funcionario---------");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Salario: " + salario);
    }
}
