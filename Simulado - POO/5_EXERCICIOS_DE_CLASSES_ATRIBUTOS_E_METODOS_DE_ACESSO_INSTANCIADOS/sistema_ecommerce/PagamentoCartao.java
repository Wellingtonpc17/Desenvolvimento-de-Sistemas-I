package sistema_ecommerce;

public class PagamentoCartao extends Pagamento {

    public String numeroCartao;

    public String bandeira;

    public PagamentoCartao(double valor, String data, String status, String numeroCartao, String bandeira) {
        super(valor, data, status);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
    }

    public void exibir() {
        System.out.println("-----Pagamento Cartao-----");
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
        System.out.println("Numero do Cartao: " + numeroCartao);
        System.out.println("Bandeira: " + bandeira);
    }
}
