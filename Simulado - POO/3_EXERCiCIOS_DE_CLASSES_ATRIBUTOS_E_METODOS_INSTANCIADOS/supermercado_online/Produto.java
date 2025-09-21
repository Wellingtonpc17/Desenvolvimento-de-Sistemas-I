package supermercado_online;

public class Produto {

    public String nome;

    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double aplicarDesconto(int quantidade) {
        double desconto;

        if (quantidade >= 10) {
            desconto = 0.15;
        } else if (quantidade >= 5) {
            desconto = 0.10;
        } else if (quantidade >= 3) {
            desconto = 0.05;
        } else {
            desconto = 0.0;
        }

        double precoComDesconto = preco * quantidade * (1 - desconto);
        return precoComDesconto;
    }

    public void exibir(int quantidade) {
        System.out.println("------- Produto -------");
        System.out.println("Nome: " + nome);
        System.out.println("Preço unitário: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço total com desconto: R$ " + aplicarDesconto(quantidade));
    }
}


