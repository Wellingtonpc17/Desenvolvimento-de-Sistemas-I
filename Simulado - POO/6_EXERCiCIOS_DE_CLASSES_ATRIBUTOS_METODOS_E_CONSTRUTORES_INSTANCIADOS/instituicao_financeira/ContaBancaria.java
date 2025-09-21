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
        return valor <= totalDisponivel;
    }

    public void exibir(double valor) {
        if (verificarSaque(valor)) {
            System.out.println("Saque de R$ " + valor + " autorizado.");
        } else {
            System.out.println("Saque de R$ " + valor + " negado. Saldo insuficiente.");
        }
    }
}

