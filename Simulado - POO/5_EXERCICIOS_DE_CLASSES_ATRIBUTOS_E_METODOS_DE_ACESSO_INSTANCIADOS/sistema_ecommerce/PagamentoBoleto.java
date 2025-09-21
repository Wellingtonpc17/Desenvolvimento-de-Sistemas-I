package sistema_ecommerce;

public class PagamentoBoleto extends Pagamento {

    public String codigoBarra;

    public String dataVencimento;

    public PagamentoBoleto(double valor, String data, String status, String codigoBarra, String dataVencimento) {
        super(valor, data, status);
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    public void exibir() {
        System.out.println("-----Pagamento Boleto-----");
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
        System.out.println("Codigo de Barras: " + codigoBarra);
        System.out.println("Data de Vencimento " + dataVencimento);
    }
}
