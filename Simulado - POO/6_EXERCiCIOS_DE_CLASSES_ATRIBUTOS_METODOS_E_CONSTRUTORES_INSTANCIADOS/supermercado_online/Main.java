package supermercado_online;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 10.00);

        int quantidade = 12;

        produto1.exibir(quantidade);
    }
}

