package sistema_gestao_concessionaria;

public class Veiculo {

    public String modelo;

    public String placa;

    public int ano;

    public Veiculo(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public void exibir() {
        System.out.println("-------Veiculo-------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}
