package sistema_gestao_veiculos;

public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CB500", 500);

        System.out.println("=== Carro ===");
        carro.exibir();

        System.out.println("\n=== Moto ===");
        moto.exibir();

        carro.setNumeroDePortas(2);
        moto.setCilindradas(650);

        System.out.println("\n=== Atualizado ===");
        carro.exibir();
        moto.exibir();
    }
}

