package sistema_gestao_midia;

public class Cameraman extends Funcionario {

    public String tipoCamera;

    public int tempoExperiencia;

    public Cameraman(String nome, String matricula, double salario, String tipoCamera, int tempoExperiencia) {
        super(nome, matricula, salario);
        this.tipoCamera = tipoCamera;
        this.tempoExperiencia = tempoExperiencia;
    }

    public void exibir() {
        System.out.println("-----Cameraman-----");
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario + " reais");
        System.out.println("Tipo de Camera: " + tipoCamera);
        System.out.println("Tempo de Experiencia: " + tempoExperiencia + " anos");
    }
}
