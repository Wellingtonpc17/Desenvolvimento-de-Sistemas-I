package sistema_bancario;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("001", 1000.0, 500.0);
        cc.depositar(200);
        cc.sacar(1300); // Usa limite
        System.out.println("Conta Corrente - Saldo final: R$" + cc.saldo);

        System.out.println("-------------");

        ContaPoupanca cp = new ContaPoupanca("002", 1500.0, 0.02);
        cp.depositar(100);
        cp.sacar(1000);
        System.out.println("Conta Poupança - Saldo final: R$" + cp.saldo);
    }
}
