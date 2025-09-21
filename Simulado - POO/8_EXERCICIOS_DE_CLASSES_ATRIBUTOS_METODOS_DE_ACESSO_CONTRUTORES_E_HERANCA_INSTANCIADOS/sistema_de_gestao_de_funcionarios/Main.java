package sistema_de_gestao_de_funcionarios;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("12345", 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca("54321", 2000.0, 1.5);

        System.out.println("=== Conta Corrente ===");
        cc.exibir();
        cc.sacar(1200);
        cc.depositar(300);
        cc.exibir();

        System.out.println("\n=== Conta Poupança ===");
        cp.exibir();
        cp.aplicarRendimento();
        cp.exibir();

        cp.setTaxaDeRendimento(2.0);
        cc.setLimiteChequeEspecial(1000.0);
    }
}

