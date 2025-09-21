package sistema_ecommerce;

public class PagamentoPix extends Pagamento {

    public String chavePix;

    public PagamentoPix(double valor, String data, String status, String chavePix) {
        super(valor, data, status);
        this.chavePix = chavePix;
    }

    public void exibir() {
        System.out.println("-----Pagamento Pix-----");
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
        System.out.println("Chave Pix: " + chavePix);
    }
}
