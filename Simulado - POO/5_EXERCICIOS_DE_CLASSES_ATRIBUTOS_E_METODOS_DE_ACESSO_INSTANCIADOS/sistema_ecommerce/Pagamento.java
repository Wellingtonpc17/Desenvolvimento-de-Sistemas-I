package sistema_ecommerce;

public class Pagamento {

    public double valor;

    public String data;

    public String status;

    public Pagamento(double valor, String data, String status) {
        this.valor = valor;
        this.data = data;
        this.status = status;
    }

    public void exibir() {
        System.out.println("-----Pagamento-----");
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Status: " + status);
    }
}
