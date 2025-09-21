package sistema_ecommerce;

public class Main {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(100.00, "01/09/2025", "Aprovado", "4444 1111 2222 3333", "Visa");
        cartao.exibir();

        PagamentoPix pix = new PagamentoPix(150.00, "20/04/2024", "Aprovado", "email@gmail.com");
        pix.exibir();

        PagamentoBoleto boleto = new PagamentoBoleto(200.00, "02/03/2023", "Aprovado", "7891234567890", "10/03/2023");
        boleto.exibir();
    }
}
