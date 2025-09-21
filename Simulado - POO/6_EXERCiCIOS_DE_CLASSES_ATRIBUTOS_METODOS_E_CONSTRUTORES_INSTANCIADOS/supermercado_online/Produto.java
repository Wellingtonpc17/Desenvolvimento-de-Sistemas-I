package supermercado_online;

public class Produto {

    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double aplicarDesconto(int quantidade) {
        double desconto = 0.0;

        if (quantidade >= 20) {
            desconto = 0.15;
        } else if (quantidade >= 10) {
            desconto = 0.10;
        } else if (quantidade >= 5) {
            desconto = 0.05;
        }

        double precoTotal = preco * quantidade;
        double valorComDesconto = precoTotal - (precoTotal * desconto);

        return valorComDesconto;
    }

    public void exibir(int quantidade) {
        System.out.println("Produto: " + nome);
        System.out.println("Preço unitário: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total com desconto: R$ " + aplicarDesconto(quantidade));
    }
}


