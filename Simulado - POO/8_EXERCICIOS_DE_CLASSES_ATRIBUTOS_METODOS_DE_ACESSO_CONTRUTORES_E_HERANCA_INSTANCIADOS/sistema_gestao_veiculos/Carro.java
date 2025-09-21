package sistema_gestao_veiculos;

public class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Número de Portas: " + numeroDePortas);
    }
}

