package instituicao_financeira;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(500.0, 200.0);
        ContaBancaria conta2 = new ContaBancaria(100.0, 50.0);
        ContaBancaria conta3 = new ContaBancaria(0.0, 0.0);

        conta1.exibir(600.0);
        conta2.exibir(160.0);
        conta3.exibir(10.0);
    }
}

