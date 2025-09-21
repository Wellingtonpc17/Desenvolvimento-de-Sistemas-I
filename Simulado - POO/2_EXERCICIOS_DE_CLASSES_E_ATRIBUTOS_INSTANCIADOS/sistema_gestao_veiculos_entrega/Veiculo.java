package sistema_gestao_veiculos_entrega;

public class Veiculo {

    public String modelo;

    public String placa;

    public double capacidadeDeCarga;

    public Veiculo(String modelo, String placa, double capacidadeDeCarga) {
        this.modelo = modelo;
        this.placa = placa;
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public void exibir() {
        System.out.println("-------Veiculo-------");
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Capacidade de carga: " + capacidadeDeCarga + " KG");

    }
}
