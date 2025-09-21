package sistema_de_gestao_de_funcionarios;

public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, double limite) {
        super(numero, saldo);
        this.limiteChequeEspecial = limite;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limite) {
        this.limiteChequeEspecial = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && getSaldo() + limiteChequeEspecial >= valor) {
            double novoSaldo = getSaldo() - valor;
            super.depositar(-valor);
            return true;
        }
        return false;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Limite Cheque Especial: R$" + limiteChequeEspecial);
    }
}

