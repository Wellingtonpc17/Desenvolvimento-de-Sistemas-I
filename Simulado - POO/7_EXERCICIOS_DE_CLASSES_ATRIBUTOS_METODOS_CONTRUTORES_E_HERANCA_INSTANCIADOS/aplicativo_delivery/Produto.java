package aplicativo_delivery;

public class Produto {

    public String nome;
    public double preco;
    public int id;

    public Produto(String nome, double preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public void exibir() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", ID: " + id);
    }
}


