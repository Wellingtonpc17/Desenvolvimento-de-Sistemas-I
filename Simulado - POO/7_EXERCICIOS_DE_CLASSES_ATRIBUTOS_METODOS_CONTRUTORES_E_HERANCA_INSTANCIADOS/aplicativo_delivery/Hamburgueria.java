package aplicativo_delivery;

public class Hamburgueria extends Restaurante {

    public boolean grelhaGas;

    public Hamburgueria(String nome, String endereco, boolean grelhaGas) {
        super(nome, endereco);
        this.grelhaGas = grelhaGas;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Grelha a gás: " + (grelhaGas ? "Sim" : "Não"));
    }
}

