package aplicativo_delivery;

public class Restaurante {

    public String nome;
    public String endereco;

    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir() {
        System.out.println("Restaurante: " + nome + ", Endereço: " + endereco);
    }
}


