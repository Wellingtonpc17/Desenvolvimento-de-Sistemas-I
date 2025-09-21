package aplicativo_delivery;

public class Cliente {

    public String nome;
    public String endereco;

    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir() {
        System.out.println("Cliente: " + nome + ", Endereço: " + endereco);
    }
}


