package sistema_de_gestao_de_funcionarios;

public class ContaPoupanca extends Conta {

    private double taxaDeRendimento;

    public ContaPoupanca(String numero, double saldo, double taxa) {
        super(numero, saldo);
        this.taxaDeRendimento = taxa;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxa) {
        this.taxaDeRendimento = taxa;
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * (taxaDeRendimento / 100);
        depositar(rendimento);
    }

    public void exibir() {
        super.exibir();
        System.out.println("Taxa de Rendimento: " + taxaDeRendimento + "%");
    }
}

