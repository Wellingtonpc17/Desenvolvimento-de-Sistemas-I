package aplicativo_delivery;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Rua A, 100");

        Produto p1 = new Produto("X-Burguer", 15.0, 1);
        Produto p2 = new Produto("Suco", 5.0, 2);
        Produto[] produtos = {p1, p2};

        Pedido pedido = new Pedido(cliente, produtos);

        Pizzaria pizzaria = new Pizzaria("Pizzaria da Vó", "Rua B, 200", "Forno elétrico");
        Hamburgueria hamburgueria = new Hamburgueria("Hamburgueria Top", "Rua C, 300", true);

        pedido.exibir();
        System.out.println();

        pizzaria.exibir();
        System.out.println();

        hamburgueria.exibir();
    }
}
