package sistema_gestao_veiculos_entrega;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo("GOL", "ABC-1234", 123.0);
        carro.exibir();

        Veiculo caminhao = new Veiculo("Scania R 450", "BCD-2345", 1000.0);
        caminhao.exibir();

        Veiculo moto = new Veiculo("PCX", "CDE-3456", 30.0);
        moto.exibir();

    }
}
