package sistema_gestao_pessoal_hospitalar;

public class Medico extends Funcionario {

    public String crm;

    public String especialidade;

    public Medico(String nome, String matricula, double salario, String crm, String especialidade) {
        super(nome, matricula, salario);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void exibir() {
        System.out.println("------Funcionario---------");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula " + matricula);
        System.out.println("Salario: " + salario);
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade);
    }
}
