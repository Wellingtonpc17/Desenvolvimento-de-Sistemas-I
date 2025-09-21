package aplicativo_delivery;

public class Pizzaria extends Restaurante {
    public String tipoDeForno;

    public Pizzaria(String nome, String endereco, String tipoDeForno) {
        super(nome, endereco);
        this.tipoDeForno = tipoDeForno;
    }

    public void exibir() {
        super.exibir();
        System.out.println("Tipo de Forno: " + tipoDeForno);
    }
}


