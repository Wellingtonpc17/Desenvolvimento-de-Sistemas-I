package instituicao_financeira;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1000.0, 500.0);
        conta1.exibir();

        double valorSaque = 1200.0;

        conta1.verificarSaque(valorSaque);
    }
}
