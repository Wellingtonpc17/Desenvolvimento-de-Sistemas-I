package ex4_sistema_bancario;

public class Banco {

    String nome;
    double saldoatual;
    double saque;
    double deposito;
    double transferir;

    public void cadastroclientes() {
        System.out.println("O cliente " + nome + " foi cadastrado!");
    }

    public void aberturaconta() {
        System.out.println("O cliente " + nome + " abriu conta!");
    }

    public void sacar() {
        saldoatual = saldoatual - saque;
        System.out.println("O cliente " + nome + " sacou: " + saque);
    }

    public void depositar() {
        saldoatual = saldoatual + deposito;
        System.out.println("O cliente " + nome + " depositou: " + deposito);
    }

    public void transf() {
        saldoatual = saldoatual - transferir;
        System.out.println("O cliente " + nome + " transferiu: " + transferir);
    }
    
    public void exibirSaldo() {
        System.out.println("O saldo atual de " + nome + " e: " + saldoatual);
    }
}