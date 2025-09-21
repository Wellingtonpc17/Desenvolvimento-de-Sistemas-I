package sistema_gestao_midia;

public class Reporter extends Funcionario {

    public String areaAtuacao;

    public int numeroReportagens;

    public Reporter(String nome, String matricula, double salario, String areaAtuacao, int numeroReportagens) {
        super(nome, matricula, salario);
        this.areaAtuacao = areaAtuacao;
        this.numeroReportagens = numeroReportagens;
    }

    public void exibir() {
        System.out.println("-----Reporter-----");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario + " reais");
        System.out.println("Area de Atuacao: " + areaAtuacao);
        System.out.println("Numero de Reportagens: " + numeroReportagens);
    }
}
