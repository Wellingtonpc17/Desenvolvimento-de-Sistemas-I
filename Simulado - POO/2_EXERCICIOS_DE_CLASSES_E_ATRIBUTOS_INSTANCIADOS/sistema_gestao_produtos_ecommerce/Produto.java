package sistema_gestao_produtos_ecommerce;

public class Produto {

    public String nome;

    public double preco;

    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void exibir() {
        System.out.println("-----Catalogo de produtos---------");
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Quantidade disponivel: " + quantidadeEstoque);
    }
}
