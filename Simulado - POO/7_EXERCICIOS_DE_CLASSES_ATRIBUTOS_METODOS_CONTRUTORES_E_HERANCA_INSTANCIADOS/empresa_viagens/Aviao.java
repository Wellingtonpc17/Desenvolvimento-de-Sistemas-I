package empresa_viagens;

public class Aviao extends Transporte {

    public double taxaDeAeroporto;

    public Aviao(int capacidade, double precoBase, double taxaDeAeroporto) {
        super(capacidade, precoBase);
        this.taxaDeAeroporto = taxaDeAeroporto;
    }

    @Override
    public double calcularValorPassagem() {
        return precoBase + taxaDeAeroporto;
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Taxa de aeroporto: R$" + taxaDeAeroporto);
        System.out.println("Valor da passagem: R$" + calcularValorPassagem());
    }
}

