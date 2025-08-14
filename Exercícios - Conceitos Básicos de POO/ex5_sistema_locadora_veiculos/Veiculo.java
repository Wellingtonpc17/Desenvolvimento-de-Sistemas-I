package ex5_sistema_locadora_veiculos;

public class Veiculo {

    String modelo;
    double valordiaria;
    double valortotal;
    int dias;

    public void calculardiaria() {
        valortotal = valordiaria * dias;
    }

    public void exibirValorTotal() {
        System.out.println("O valor total para " + dias + " dias de locacao do veículo " + modelo + " e: R$ " + valortotal);
    }
}
