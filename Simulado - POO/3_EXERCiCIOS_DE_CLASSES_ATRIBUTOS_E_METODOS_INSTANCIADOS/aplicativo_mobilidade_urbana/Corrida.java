package aplicativo_mobilidade_urbana;

public class Corrida {

    public double distanciaPercorrida;

    public double tarifaBase;

    public double multiplicadorTarifa;

    public Corrida(double distanciaPercorrida, double tarifaBase, double multiplicadorTarifa) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.tarifaBase = tarifaBase;
        this.multiplicadorTarifa = multiplicadorTarifa;
    }

    public double calcularValorTotal() {
        double precoPorKm = 1.0;
        return tarifaBase + (distanciaPercorrida * precoPorKm * multiplicadorTarifa);
    }

    public void exibir() {
        System.out.println("----- Corrida -----");
        System.out.println("Distância: " + distanciaPercorrida + " km");
        System.out.println("Tarifa base: R$" + tarifaBase);
        System.out.println("Multiplicador: " + multiplicadorTarifa);
        System.out.println("Valor total: R$" + calcularValorTotal());
    }
}
