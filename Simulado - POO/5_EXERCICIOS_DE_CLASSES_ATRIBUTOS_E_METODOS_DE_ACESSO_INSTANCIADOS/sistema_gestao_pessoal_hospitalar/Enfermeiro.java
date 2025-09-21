package sistema_gestao_pessoal_hospitalar;

public class Enfermeiro extends Funcionario {

    public String coren;

    public Enfermeiro(String nome, String matricula, double salario, String coren) {
        super(nome, matricula, salario);
        this.coren = coren;
    }

    public void exibir() {
        System.out.println("------Funcionario---------");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Salario: " + salario);
        System.out.println("COREN: " + coren);
    }
}
