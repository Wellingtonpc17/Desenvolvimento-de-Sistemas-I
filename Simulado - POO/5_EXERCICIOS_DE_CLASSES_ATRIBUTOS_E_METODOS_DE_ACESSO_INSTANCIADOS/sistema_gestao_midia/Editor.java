package sistema_gestao_midia;

public class Editor extends Funcionario {

    public String softwareEdicao;

    public Editor(String nome, String matricula, double salario, String softwareEdicao) {
        super(nome, matricula, salario);
        this.softwareEdicao = softwareEdicao;
    }

    public void exibir() {
        System.out.println("-----Editor-----");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario + " reais");
        System.out.println("Software de Edicao: " + softwareEdicao);
    }
}
