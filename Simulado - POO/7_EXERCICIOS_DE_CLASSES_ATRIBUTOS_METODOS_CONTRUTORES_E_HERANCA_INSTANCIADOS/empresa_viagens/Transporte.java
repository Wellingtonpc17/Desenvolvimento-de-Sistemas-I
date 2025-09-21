package empresa_viagens;

public class Transporte {

    public int capacidade;
    public double precoBase;

    public Transporte(int capacidade, double precoBase) {
        this.capacidade = capacidade;
        this.precoBase = precoBase;
    }

    public double calcularValorPassagem() {
        return precoBase;
    }

    public void exibir() {
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Preço base: R$" + precoBase);
    }
}

