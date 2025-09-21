package sistema_bancario;

public class ContaPoupanca extends Conta {

    public double taxaDeJuros;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaDeJuros) {
        super(numeroConta, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }
}


