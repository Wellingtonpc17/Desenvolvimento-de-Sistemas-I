package empresa_viagens;

public class Main {
    public static void main(String[] args) {

        Onibus onibus = new Onibus(50, 100.0, 45);
        Aviao aviao = new Aviao(180, 300.0, 50.0);

        Viagem viagem1 = new Viagem("Rio de Janeiro", onibus);
        Viagem viagem2 = new Viagem("São Paulo", aviao);

        System.out.println("=== Viagem 1 ===");
        viagem1.exibir();

        System.out.println("\n=== Viagem 2 ===");
        viagem2.exibir();
    }
}

