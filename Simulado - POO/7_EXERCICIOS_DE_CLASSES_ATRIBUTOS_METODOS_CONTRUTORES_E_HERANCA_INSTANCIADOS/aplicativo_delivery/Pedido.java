package aplicativo_delivery;

public class Pedido {
    public Produto[] produtos;
    public Cliente cliente;

    public Pedido(Cliente cliente, Produto[] produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < produtos.length; i++) {
            total += produtos[i].preco;
        }
        return total;
    }

    public void exibir() {
        System.out.println("Pedido do Cliente:");
        cliente.exibir();
        System.out.println("Produtos:");
        for (int i = 0; i < produtos.length; i++) {
            produtos[i].exibir();
        }
        System.out.println("Total: R$" + calcularTotal());
    }
}

