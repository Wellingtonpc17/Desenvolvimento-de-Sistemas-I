package supermercado_online;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Arroz", 10.0);
        int quantidadeComprada = 6;

        produto1.exibir(quantidadeComprada);
    }
}
