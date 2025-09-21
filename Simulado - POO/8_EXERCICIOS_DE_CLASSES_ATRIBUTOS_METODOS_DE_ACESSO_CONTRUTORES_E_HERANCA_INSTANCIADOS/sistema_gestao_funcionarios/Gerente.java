package sistema_gestao_funcionarios;

public class Gerente extends Funcionario {

    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Bônus Anual: R$" + bonusAnual);
    }
}

