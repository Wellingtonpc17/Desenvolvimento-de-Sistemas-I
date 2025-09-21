package sistema_gestao_concessionaria;

public class Moto extends Veiculo {

    public int cilindradas;

    public Moto(String modelo, String placa, int ano, int cilindradas) {
        super(modelo, placa, ano);
        this.cilindradas = cilindradas;
    }

    public void exibir() {
        System.out.println("-------Moto-------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas + "cc");
    }
}
