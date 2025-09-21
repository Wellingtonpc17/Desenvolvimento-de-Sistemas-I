package empresa_viagens;

public class Onibus extends Transporte {

    public int numeroAssentos;

    public Onibus(int capacidade, double precoBase, int numeroAssentos) {
        super(capacidade, precoBase);
        this.numeroAssentos = numeroAssentos;
    }

    @Override
    public double calcularValorPassagem() {
        return precoBase * 1.10; // exemplo: 10% a mais sobre o preço base
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Número de assentos: " + numeroAssentos);
        System.out.println("Valor da passagem: R$" + calcularValorPassagem());
    }
}

