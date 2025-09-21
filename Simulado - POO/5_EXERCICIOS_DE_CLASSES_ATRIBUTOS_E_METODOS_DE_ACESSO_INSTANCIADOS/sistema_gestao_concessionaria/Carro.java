package sistema_gestao_concessionaria;

public class Carro extends Veiculo {

    public int numeroPortas;

    public Carro(String modelo, String placa, int ano, int numeroPortas) {
        super(modelo, placa, ano);
        this.numeroPortas = numeroPortas;
    }

    public void exibir() {
        System.out.println("-------Carro-------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Numero de portas: " + numeroPortas + " portas");
    }
}
