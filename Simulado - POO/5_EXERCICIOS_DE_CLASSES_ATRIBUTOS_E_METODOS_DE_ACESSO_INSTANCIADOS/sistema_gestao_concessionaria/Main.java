package sistema_gestao_concessionaria;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Gol", "ABCD-123", 2015, 4);
        carro1.exibir();

        Moto moto1 = new Moto("PCX", "BCDE-234", 2025, 160);
        moto1.exibir();
    }
}
