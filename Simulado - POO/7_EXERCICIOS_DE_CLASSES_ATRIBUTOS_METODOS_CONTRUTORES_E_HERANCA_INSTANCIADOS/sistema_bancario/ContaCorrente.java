package sistema_bancario;

public class ContaCorrente extends Conta {

    public double limiteDeCredito;

    public ContaCorrente(String numeroConta, double saldoInicial, double limiteDeCredito) {
        super(numeroConta, saldoInicial);
        this.limiteDeCredito = limiteDeCredito;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limiteDeCredito) >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado (com limite de crédito).");
            return true;
        } else {
            System.out.println("Saque não autorizado. Limite insuficiente.");
            return false;
        }
    }
}

