package ex4_sistema_bancario;

public class Main {

    public static void main(String[] args) {
        Banco cliente1 = new Banco();
        cliente1.nome = "Joao";
        cliente1.saldoatual = 1000.00;
        cliente1.cadastroclientes();
        cliente1.aberturaconta();
        cliente1.deposito = 500.00;
        cliente1.depositar();
        cliente1.saque = 200.00;
        cliente1.sacar();
        cliente1.transferir = 300.00;
        cliente1.transf();
        cliente1.exibirSaldo();
    }
}
