package instituicao_financeira;

public class ContaBancaria {

    public double saldo;

    public double limiteCredito;

    public ContaBancaria(double saldo, double limiteCredito) {
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }

    public boolean verificarSaque(double valor) {
        double totalDisponivel = saldo + limiteCredito;

        if (valor <= totalDisponivel) {
            System.out.println("Saque de R$" + valor + "  permitido.");
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " não permitido.");
            return false;
        }
    }

    public void exibir() {
        System.out.println("----- Conta Bancária -----");
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite de crédito: R$" + limiteCredito);
    }
}
